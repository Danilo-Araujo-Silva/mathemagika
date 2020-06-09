//////////////////////////////////////////////////////////////////////////////////////
//
//   J/Link source code (c) 1999-2020, Wolfram Research, Inc. All rights reserved.
//
//   Use is governed by the terms of the J/Link license agreement, which can be found at
//   www.wolfram.com/solutions/mathlink/jlink.
//
//   Author: Todd Gayley
//
//////////////////////////////////////////////////////////////////////////////////////

package com.wolfram.jlink;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;


/* This is the worker class that does all the actual classloading. The JLinkClassLoader class is just a facade
 * that defers all loading to an instance of this class. This system gives us the ability to add locations to 
 * the start as well as the end of the class path. The URLClassLoader that we want to inherit much useful 
 * behavior from does not support adding to the start of the class path--only the end. When we want to add 
 * locations to the start of the path we need to create a new loader with a newly-ordered set of locations. 
 * To avoid changing the identity of the JLinkClassLoader instance (shared, and possibly cached, by other code),
 * we make that instance an unchanging facade that swaps out its implementation as needed. The implementation
 * is this class, and every time we create a new instance of this class we keep a reference to the old one.
 * When looking up a class in findClass(), we always go down the chain of old instances and ask them if
 * they have already loaded the requested class. In this way we never reload classes, but we force all new
 * loading to happen in the current JLinkClassLoaderHelper instance.
 */

public class JLinkClassLoaderHelper extends URLClassLoader {
    
    static {
        /* ensure that getClassLoadingLock() gets used universally
         * This requires that URLClassLoader has registered
         * which appears to be the case. */
        ClassLoader.registerAsParallelCapable();
    }

    private final JLinkClassLoader top;
    private final JLinkClassLoaderHelper prevLoader;
            
    JLinkClassLoaderHelper(URL[] urls, JLinkClassLoaderHelper prevLoader, ClassLoader parent, JLinkClassLoader top) {
        super(urls, parent);
        this.prevLoader = prevLoader;
        this.top = top;
    }
    
    /**
     * Returns the object which protects this instance's class loading.
     * This <em>should</em> be {@link #top}.
     * After all, {@code top} is used as the universal lock so that no matter which
     * of the linked {@link JLinkClassLoaderHelper}'s is chosen as the entry point, 
     * there will be no lock ordering issue.  Unfortunately, this convention is broken by the superclass.
     * Thus, if the superclass initiates the class loading, then it may obtain the lock on this object
     * before obtaining the lock on {@code top}, while normal class loading first obtained the lock
     * on {@code top}, resulting in deadlock.
     * Barring another way around this, and considering that the explicit locking
     * in this class is new
     * (to fix bug 190015), this method is used to enforce lock ordering, at the possible
     * cost of correctness, by refusing
     * to lock on {@code top} if the calling thread already has a lock on {@code this}.
     * In such an unfortunate case, {@code this} is returned; otherwise {@code top} is returned.
     * (Of course, if the calling thread already owns both locks, it matter which is
     * returned.)  This should hopefully fix bug 271621 while continuing to minimize the impact of
     * bug 190015.
     * 
     * @return the object on which to lock.
     * @author jmichelson
     */
    private Object lockObject() {
        /* note: now that getClassLoadingLock(String) has been overridden to return
         * top, top should always be returned.  This conditional has been kept
         * merely out of paranoia, per the earlier-than-Jan-4-2016 comments in bug 271621. 
         */
        //assert !Thread.holdsLock(this); // comment out of production
        return Thread.holdsLock(this) ? this : top;
    }
    
    @Override
    protected Object getClassLoadingLock(String className) {
        return lockObject();
    }
    
    // Cannot override findLoadedClass() because it is final, so give it a new name.
    Class findLoadedClassExposed(String name) {
        
        synchronized (lockObject()) {
            // Give the previous loaders a chance to produce a previously-loaded class.
            Class c = null;
            if (prevLoader != null)
                c = prevLoader.findLoadedClassExposed(name);
            if (c == null)
                c = findLoadedClass(name);
            return c;
        }
    }
    
    Package getPackageDefinedByJLinkHelper(String name) {
        synchronized (lockObject()) {
            Package p = null;
            if (null != prevLoader) {
                p = prevLoader.getPackageDefinedByJLinkHelper(name);
            }
            return null == p ? super.getPackage(name) : p;
        }
    }
    
    /**
     * 
     * {@inheritDoc}
     * <br />
     * This method is overridden in order to ensure that every class in a package is in
     * the same package, even if another instance of this class has been prepended to the
     * chain since one class in that package was loaded.  This fixes bug 349082.
     */
    @Override
    protected Package definePackage(String name,
                                    String specTitle,
                                    String specVersion,
                                    String specVendor,
                                    String implTitle,
                                    String implVersion,
                                    String implVendor,
                                    URL sealBase) {
        synchronized (lockObject()) {
            Package p = top.getPackageDefinedByJLink(name);
            if (null == p) {
                p = super.definePackage(name,
                                        specTitle, specVersion, specVendor,
                                        implTitle, implVersion, implVendor,
                                        sealBase);
                top.registerPackage(p, this);
            }
            return p;
        }
    }
    
    /**
     * 
     * {@inheritDoc}
     * <br />
     * This method is overridden in order to ensure that every class in a package is in
     * the same package, even if another instance of this class has been prepended to the
     * chain since one class in that package was loaded.  This fixes bug 349082.
     */
    @Override
    protected Package getPackage(String name) {
        return top.getPackageDefinedByJLink(name);
    }
    

    public void addURL(URL url) {
        super.addURL(url);
    }
    
    private Package getClassPackage(String clazz) {
        if (null == clazz) {
            return null;
        }
        
        final int lastDot = clazz.lastIndexOf('.'); // because nested classes have a "$", not "."
        // the default package presumably is ""
        return getPackage(clazz.substring(0, Math.max(0, lastDot)));
    }

    protected Class findClass(String name) throws ClassNotFoundException {
        
        synchronized (lockObject()) {
            // Allow the whole chain of helper loaders to look the class up in their previously-loaded
            // sets _before_ calling super.findClass()
            Class c = top.findLoadedClassExposed(name);            
            if (c == null) {
                /* If not previously loaded, but a member of its package has been loaded,
                 * then use the classloader of that package.  See bug 349082.
                 * Otherwise, then look for it in the current set of URL locations.
                 */
                Package p = getClassPackage(name);
                if (null != p) {
                    JLinkClassLoaderHelper cl = top.getPackageLoader(p);
                    if (null != cl && this != cl) { // the last fallback will load it if this == cl
                        try {
                            c = cl.findClassAlone(name);
                        } catch (ClassNotFoundException e) {
                            // give this class a chance to find it.
                        }
                    }
                }
                
                if (null == c) {
                    c = super.findClass(name);
                }
            }
            return c;
        }
    }
    
    /**
     * Invokes {@link URLClassLoader#findClass(String) super.findClass(name)}.
     * 
     * @param name the name of the class
     * @return the class
     * @throws ClassNotFoundException if the class definition could not be found
     */
    private Class<?> findClassAlone(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }

    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        
        synchronized (lockObject()) {
            // First, check if the class has already been loaded
            Class<?> c = top.findLoadedClassExposed(name);
            if (c != null) {
                if (resolve)
                    resolveClass(c);
            } else {
                Package p = getClassPackage(name);
                if (null != p) {
                    JLinkClassLoaderHelper cl = top.getPackageLoader(p);
                    if (null != cl && this != cl) { // the last fallback will load it if this == cl
                        try {
                            c = cl.loadClassAlone(name, resolve);
                        } catch (ClassNotFoundException e) {
                            // give this class a chance to find it.
                        }
                    }
                }
                
                if (null == c) {
                    c = super.loadClass(name, resolve);
                }
            }
            return c;
        }
    }
    
    /**
     * Invokes {@link URLClassLoader#loadClass(String, boolean) super.loadClass(name, resolve)}.
     * 
     * @param name the name of the class
     * @param resolve {@code true} to resolve the class and {@code false} otherwise
     * @return the class
     * @throws ClassNotFoundException if the class definition could not be found
     */
    private Class<?> loadClassAlone(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }


    protected String findLibrary(String libName) {
        
        String platformSpecificName = System.mapLibraryName(libName);
        URL[] locs = getURLs();
        for (int i = 0; i < locs.length; i++) {
            if (locs[i].getProtocol().equals("file")) {
                String fileName = locs[i].getFile();
                boolean isJarOrZip = fileName.toLowerCase().endsWith(".zip") || fileName.toLowerCase().endsWith(".jar");
                if (!isJarOrZip) {
                    // Treat fileName as a dir name. Look for the library in this dir and also dir/Libraries/$SystemID/.
                    File f = new File(fileName, platformSpecificName);
                    if (f.exists())
                        return f.getAbsolutePath();
                    f = new File(fileName, "Libraries" + java.io.File.separator + 
                                        Utils.getSystemID() + java.io.File.separator + platformSpecificName);
                    if (f.exists())
                        return f.getAbsolutePath();
                }
            }
        }
        return null;
    }


    // In effect, a public export of the final ClassLoader method defineClass().
    public Class classFromBytes(String className, byte[] bytes) {
        
        Class c = defineClass(className, bytes, 0, bytes.length);
        resolveClass(c);
        return c;
    }

}
