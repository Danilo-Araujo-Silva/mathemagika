
package com.wolfram.jlink.util;

import com.wolfram.jlink.*;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;


/**
 * MathematicaTask is an Ant task that allows you to call Mathematica from Ant build files.
 * Ant (<a href="http://ant.apache.org">http://ant.apache.org</a>) is a popular Java-based
 * build tool.
 * <p>
 * You can run Mathematica as a processing step in your build, call Mathematica testing functions,
 * or any other operations you desire. Because MathematicaTask lets you call back into Ant from
 * Mathematica (e.g., to execute other tasks, set/read properties, or log messages), you can use
 * Mathematica as a scripting language for Ant.
 * <p><p>
 * To use the &lt;mathematica&gt; task, you must include a taskdef line in your build.xml file like the following
 * examples:
 * <pre>
 * &lt;!-- If JLink.jar is on your system CLASSPATH: --&gt;
 * &lt;taskdef name="mathematica" classname="com.wolfram.jlink.util.MathematicaTask"/&gt;
 *
 * &lt;!-- If JLink.jar is NOT on your system CLASSPATH: --&gt;
 * &lt;taskdef name="mathematica" classname="com.wolfram.jlink.util.MathematicaTask"
 *           classpath="/full/path/to/JLink.jar"/&gt; </pre>
 *
 * <h3>Attributes</h3>
 * <table border="1" cellpadding="2" cellspacing="0">
 * <tr>
 *  <td valign="top"><b>Attribute</b></td>
 *  <td valign="top"><b>Description</b></td>
 *  <td align="center" valign="top"><b>Required</b></td>
 * </tr>
 * <tr>
 *  <td valign="top">exe</td>
 *  <td valign="top">The path to the Mathematica kernel to launch</td>
 *  <td valign="top" align="center">Either exe or cmdline must be specified</td>
 * </tr>
 * <tr>
 *  <td valign="top">cmdline</td>
 *  <td valign="top">The full set of MathLink command-line args to use to connect to the kernel</td>
 *  <td valign="top" align="center">Either exe or cmdline must be specified</td>
 * </tr>
 * <tr>
 *  <td valign="top">runfile</td>
 *  <td valign="top">The path to a .m file to be run when the kernel is launched. This is convenient
 *                   when you want to specify some or all of the code in a file instead of directly in
 *                   the task.</td>
 *  <td valign="top" align="center">No</td>
 * </tr>
 * <tr>
 *  <td valign="top">fresh</td>
 *  <td valign="top">Whether to start a fresh kernel for this task (if a previously-used
 *                     kernel is running, it will be quit first)</td>
 *  <td valign="top" align="center">No, defaults to false</td>
 * </tr>
 * <tr>
 *  <td valign="top">quit</td>
 *  <td valign="top">Whether to force the kernel to quit immediately after this task finishes</td>
 *  <td valign="top" align="center">No, defaults to false</td>
 * </tr>
 * <tr>
 *  <td valign="top">timeout</td>
 *  <td valign="top">The maximum number of seconds to allow for the computation.
 *                   If not finished, the kernel will be killed.</td>
 *  <td valign="top" align="center">No, defaults to Integer.MAX_VALUE</td>
 * </tr>
 * <tr>
 *  <td valign="top">timeoutproperty</td>
 *  <td valign="top">The name of a property to set if the timeout expires. The named property will be set to true.</td>
 *  <td valign="top" align="center">No</td>
 * </tr>
 * <tr>
 *  <td valign="top">failonerror</td>
 *  <td valign="top">Whether a MathLink error (unlikely) or a timeout should cause the build to fail.</td>
 *  <td valign="top" align="center">No, defaults to true</td>
 * </tr>
 * </table>
 * <p>
 * You have two ways of specifying how to launch or connect to the Mathematica kernel. Most
 * users will use the exe parameter, which specifies the path to the kernel to launch. In rare cases
 * you might need more control over how the kernel is launched, or you might want to connect to
 * an already-running kernel (not launched by Ant). In such cases, you can use the cmdline
 * parameter, which lets you specify a full set of command-line MathLink arguments (e.g.,
 * "-linkmode connect -linkname 1234 -linkprotocol tcpip").
 * <p>
 * <h3>Calling back to Ant</h3>
 * Your Mathematica code can use the following functions to call back into Ant:
 * <table border="1" cellpadding="2" cellspacing="0">
 * <tr>
 *  <td valign="top"><b>Function</b></td>
 *  <td valign="top"><b>Description</b></td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">AntTask["taskname", <i>taskattributes</i>]</td>
 *  <td valign="top">Execute the given task, with optional attributes set in the form of "attrname"->"value" rules.</td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">AntProperty["propertyname"]</td>
 *  <td valign="top">Returns the string value of the specified Ant property.</td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">AntSetProperty["propertyname", "value"]</td>
 *  <td valign="top">Sets the value of the specified Ant property.</td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">AntReference["refId"]</td>
 *  <td valign="top">Lookup the corresponding object by its id (such as a defined &lt;path&gt; element
 *                   from its id atribute). Unlike AntProperty, which
 *                   always returns a string, AntReference returns a JavaObject expression; to
 *                   use it in your Mathematica code you will have to inspect the Ant API docs
 *                   for the particular class.</td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">AntLog["message"]</td>
 *  <td valign="top">Write the given message to the Ant log.</td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">AntFail["message"]</td>
 *  <td valign="top">Abort the Mathematica code and cause the Ant build to fail with the given message.</td>
 * </tr>
 * <tr>
 *  <td valign="top" nowrap="true">Ant["objectName"]</td>
 *  <td valign="top">General-purpose function for obtaining a reference to a specified Ant object.
 *                    The allowed object names are "Project", "Target", "Task", and "Location".
 *                    Use this function when you want to make direct calls into the Ant API.
 *                    The other Mathematica functions listed above are convenience functions
 *                    that are implemented using the Ant[] function.</td>
 * </tr>
 * </table>
 *
 * <h3>Examples</h3>
 * The examples below assume that you have a mathExe property defined that gives the path to
 * the kernel to launch. Here are typical definitions of that property for various operating systems:
 * <pre>
 * &lt;!-- Windows --&gt;
 * &lt;property name="mathExe", value="c:/program files/wolfram research/mathematica/5.2/mathkernel"/&gt;
 *
 * &lt;!-- Linux, Unix ('math' is typically on PATH) --&gt;
 * &lt;property name="mathExe", value="math"/&gt;
 *
 * &lt;!-- Mac OS/X --&gt;
 * &lt;property name="mathExe", value="/Applications/Mathematica\ 5.2.app/Contents/MacOS/MathKernel"/&gt;</pre>
 *
 * This simple example loads a package and calls a function. It uses AntFail to make the Ant build fail
 * if a testing function does not succeed.
 * <pre>
 *    &lt;target name="runMathTests"&gt;
 *      &lt;mathematica exe="${mathExe}"&gt;
 *        &lt;![CDATA[
 *           Get["MyTestPackage`"];
 *           result = CallTestFunction[];
 *           If[!TrueQ[result],
 *              AntFail["Mathematica test function failed"]
 *           ]
 *        ]]&gt;
 *      &lt;/mathematica&gt;
 *    &lt;/target&gt; </pre>
 *
 * This example demonstrates the use of AntProperty to obtain the value of an Ant property
 * as a string in your Mathematica code.
 * <pre>
 *    &lt;property name="codeDir" value="${basedir}/MyCodeDir"&gt;
 *
 *    &lt;target name="propertyExample"&gt;
 *      &lt;mathematica exe="${mathExe}"&gt;
 *        &lt;![CDATA[
 *           Get[ToFileName[AntProperty["codeDir"], "SuperPackage.m"]];
 *           ...
 *        ]]&gt;
 *      &lt;/mathematica&gt;
 *    &lt;/target&gt; </pre>
 *
 * This example demonstrates the use of AntReference to bring a list of directories defined
 * in a &lt;path&gt; element into your Mathematica code. In this case, AntReference returns an
 * Ant Path object, the methods for which are described in the Ant API docs:
 * <pre>
 *    &lt;path id="mathPath"&gt;
 *       ... dirsets, pathelements, etc.
 *    &lt;/path&gt;
 *
 *    &lt;target name="refExample"&gt;
 *      &lt;mathematica exe="${mathExe}"&gt;
 *        &lt;![CDATA[
 *           mathPathDirs = AntReference["mathPath"]@list[];
 *           $Path = Join[mathPathDirs, $Path];
 *           ...
 *        ]]&gt;
 *      &lt;/mathematica&gt;
 *    &lt;/target&gt; </pre>
 *
 * This example shows how to call the Ant &lt;echo&gt; task from Mathematica code
 * (this is just a simple task example--there are easier ways to have Mathematica output appear
 * in the console, including simply calling Print[]):
 * <pre>
 *    &lt;target name="scriptingExample"&gt;
 *      &lt;mathematica exe="${mathExe}"&gt;
 *        &lt;![CDATA[
 *           For[i = 0, i < 10, i++,
 *              AntTask["echo", "message"->ToString[i^2]]
 *           ]
 *        ]]&gt;
 *      &lt;/mathematica&gt;
 *    &lt;/target&gt; </pre>
 *
 * @since 3.1
 */

public class MathematicaTask extends Task implements PacketListener {

    static KernelLink ml = null;

    String exe = null;
    String cmdLine = null;

    boolean freshKernel = false;
    boolean quit = false;
    String runFile = null;
    int timeout = Integer.MAX_VALUE;
    String timeoutProperty = null;
    boolean failOnError = true;

    String code = "";
    String failMsg = null;


    /***********************  Attribute Setters  **********************/

    public void setExe(String exe) {
        this.exe = exe;
    }

    public void setCmdline(String cmdLine) {
        this.cmdLine = cmdLine;
    }

    public void setFresh(boolean fresh) {
        this.freshKernel = fresh;
    }

    public void setQuit(boolean quit) {
        this.quit = quit;
    }

    public void setRunfile(String runFile) {
        this.runFile = runFile;
    }

    public void setTimeout(int seconds) {
        this.timeout = seconds;
    }

    public void setTimeoutproperty(String timeoutProperty) {
        this.timeoutProperty = timeoutProperty;
    }

    public void setFailonerror(boolean failOnError) {
        this.failOnError = failOnError;
    }


    // Called by Ant with the text of the CDATA section, which is the code to execute.
    //
    public void addText(String code) {
        this.code = code;
    }


    // Called from Mathematica via the AntFail function to force a build failure.
    //
    public void setFail(String msg) {
        failMsg = msg;
    }


    /**************************  Execute  **************************/

    public void execute() throws BuildException {

        if (freshKernel)
            closeKernel();

        if (ml == null)
            ml = initKernel();

        TimeoutThread timeoutThread = null;

        try {
            timeoutThread = startTimeoutThread();

            ml.putFunction("EvaluatePacket", 1);
            ml.putFunction("Set", 2);
              ml.putSymbol("$this");
              ml.put(this);
            ml.discardAnswer();

            if (runFile != null) {
                ml.putFunction("EvaluatePacket", 1);
                ml.putFunction("Get", 1);
                ml.put(runFile);
                ml.discardAnswer();
            }
            if (code != null && !code.equals("")) {
                ml.evaluate(code);
                ml.discardAnswer();
            }
            // failMsg comes from a deliberate call to AntFail[]. Always throw.
            if (failMsg != null)
                throw new BuildException(failMsg, getLocation());
        } catch (MathLinkException e) {
            boolean wasTimeout = timeoutThread != null && timeoutThread.timeExpired;
            if (wasTimeout && timeoutProperty != null)
                getProject().setNewProperty(timeoutProperty, "true");
            String msg = wasTimeout ?
                            "Mathematica task killed on expired timeout of " + timeout + " seconds." :
                            "Mathematica task had a link error: " + ml.errorMessage();
            if (failOnError)
                throw new BuildException(msg, e, getLocation());
            else
                log(msg);
        } finally {
            killTimeoutThread(timeoutThread);
            failMsg = null;
            //setDefaults();
            if (quit || ml.error() != MathLink.MLEOK)
                closeKernel();
        }
    }


    protected KernelLink initKernel() {

        KernelLink ml = null;
        String[] args = new String[]{"-linkmode", "launch", "-linkname", ""};
        boolean useArray = false;

        if (exe != null) {
            useArray = true;
            String quoteChar = Utils.isWindows() ? "" : "'";
            args[3] = quoteChar + exe + quoteChar + " -mathlink";
        } else if (cmdLine == null) {
            throw new BuildException("Must specify exe or cmdline attribute to control kernel launch.", getLocation());
        }

        try {
            if (useArray) {
                // Simple kernel launch.
                ml = MathLinkFactory.createKernelLink(args);
                ml.discardAnswer();
            } else {
                ml = MathLinkFactory.createKernelLink(cmdLine);
                ml.connect();
            }
            ml.enableObjectReferences();
            ml.evaluateToInputForm(startupCode, 0);
            // Make the link a terminating link, so that if user kills the Ant task the kernel will die
            // as quickly as possible.
            ml.evaluateToInputForm("MathLink`SetTerminating[$ParentLink, True]", 0);
            ml.addPacketListener(this);
        } catch (MathLinkException e) {
            throw new BuildException("Failed to launch or connect to Mathematica kernel: " + e.getMessage(), e, getLocation());
        }
        return ml;
    }


    protected void closeKernel() {

        if (ml!= null) {
            ml.terminateKernel();
            ml.close();
            ml = null;
        }
    }

    protected TimeoutThread startTimeoutThread() {

        // Don't even start unless a timeout was set.
        if (timeout < Integer.MAX_VALUE) {
            long startTime = System.currentTimeMillis();
            TimeoutThread timeoutThread = new TimeoutThread(ml, startTime + timeout * 1000);
            timeoutThread.start();
            return timeoutThread;
        } else {
            return null;
        }
    }

    protected void killTimeoutThread(TimeoutThread timeoutThread) {

        if (timeoutThread != null) {
            timeoutThread.kill = true;
            try { timeoutThread.join(); } catch (InterruptedException e) {}
        }
    }


    // Empty Javadoc comment to avoid importing inherited one.
    /** &nbsp;
    */
    public boolean packetArrived(PacketArrivedEvent evt) throws MathLinkException {
         if (evt.getPktType() == MathLink.TEXTPKT) {
             KernelLink ml = (KernelLink) evt.getSource();
             log(ml.getString());
         }
         return true;
     }


    private static String startupCode =
        "Ant[obj_String] :=                                                     " +
        "   Switch[ToLowerCase[obj],                                            " +
        "       \"project\",                                                    " +
        "           Ant[\"target\"]@getProject[],                               " +
        "       \"target\",                                                     " +
        "           $this@getOwningTarget[],                                    " +
        "       \"task\",                                                       " +
        "           $this,                                                      " +
        "       \"location\",                                                   " +
        "           $this@getLocation[],                                        " +
        "       _,                                                              " +
        "           AntLog[\"Unknown object type in Ant function: \" <> obj];   " +
        "           $Failed                                                     " +
        "   ];                                                                  " +
        "AntTask[name_String, args___?OptionQ] :=                               " +
        "   JavaBlock[                                                          " +
        "      Module[{task, attrNames, attrVals},                              " +
        "          task = Ant[\"project\"]@createTask[name];                    " +
        "          attrNames =                                                  " +
        "             StringReplace[#, a_ ~~ b___  :> ToUpperCase[a] <> b]& /@  " +
        "                 First /@ Flatten[{args}];                             " +
        "          attrVals = Last /@ Flatten[{args}];                          " +
        "          With[{meth = ToExpression[\"set\" <> #1]},                   " +
        "              task@meth[#2]                                            " +
        "          ]& @@@ Thread[{attrNames, attrVals}];                        " +
        "          task@perform[]                                               " +
        "      ]                                                                " +
        "   ];                                                                  " +
        "AntLog[msg_String] := Ant[\"project\"]@log[msg];                       " +
        "AntLog[e_] := AntLog[ToString[e, FormatType->InputForm]];              " +
        "AntProperty[p_String] := Ant[\"project\"]@getProperty[p];              " +
        "AntSetProperty[p_String, val_String] := Ant[\"project\"]@setProperty[p, val];" +
        "AntReference[ref_String] := Ant[\"project\"]@getReference[ref];        " +
        "AntFail[msg:_String:\"\"] := ($this@setFail[msg]; Abort[])";


    // Implements timeout feature.
    private static class TimeoutThread extends Thread {

        private KernelLink ml;
        private long endTime;
        volatile boolean kill = false; // Whether to kill this thread (not the kernel).
        volatile boolean timeExpired = false; // Whether the timeout triggered.

        TimeoutThread(KernelLink ml, long endTime) {

            super("MathematicaTask Kernel-Killer Thread");
            setDaemon(true);
            this.ml = ml;
            this.endTime = endTime;
        }

        public void run() {

            while(!kill && System.currentTimeMillis() < endTime) {
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
            if (!kill) {
                timeExpired = true;
                ml.terminateKernel();
            }
        }
    }
}
