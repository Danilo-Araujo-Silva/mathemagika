//////////////////////////////////////////////////////////////////////////////////////
//
//   J/Link source code (c) 1999-2000, Wolfram Research, Inc. All rights reserved.
//
//   Use is governed by the terms of the J/Link license agreement, which can be found at
//   www.wolfram.com/solutions/mathlink/jlink.
//
//   Author: Todd Gayley
//
//////////////////////////////////////////////////////////////////////////////////////

package com.wolfram.jlink;

import java.awt.event.*;

/**
 * This class lets you trigger a call into Mathematica on the occurrence of a particular event.
 * Like all the MathXXXListener classes, it is intended to be used primarily from Mathematica, although it
 * can be used from Java code as well.
 * <P>
 * In response to an WindowEvent, objects of this class send to Mathematica:
 * <PRE>
 *     userFunc[theWindowEvent]</PRE>
 * 
 * userFunc is specified as a string, either a function name or an expression
 * (like a pure function "foo[#]&"), via the setHandler() method.
 */

public class MathWindowListener extends MathListener implements WindowListener {

	/**
	 * The constructor that is called from Mathematica.
	 */
	
	public MathWindowListener() {
		super();
	}

	/**
	 * You must use this constructor when using this class in a Java program,
	 * because you need to specify the KernelLink that will be used.
	 * 
	 * @param ml The link to which computations will be sent when WindowEvents arrive.
	 */
	
	public MathWindowListener(KernelLink ml) {
		super(ml);
	}

	/**
	 * This form of the constructor lets you skip having
	 * to make a series of setHandler() calls. Use this constructor from Mathematica code only.
	 * 
	 * @param handlers An array of {meth, func} pairs associating methods in the WindowListener
	 * interface with Mathematica functions.
	 */
	
	public MathWindowListener(String[][] handlers) {
		super(handlers);
	}

	////////////////////////////////////  Event handler methods  /////////////////////////////////////////
	
	public void windowActivated(WindowEvent e) {
		callVoidMathHandler("windowActivated", new Object[]{e});
	}

	public void windowClosed(WindowEvent e) {
		callVoidMathHandler("windowClosed", new Object[]{e});
	}

	public void windowClosing(WindowEvent e) {
		callVoidMathHandler("windowClosing", new Object[]{e});
	}

	public void windowDeactivated(WindowEvent e) {
		callVoidMathHandler("windowDeactivated", new Object[]{e});
	}

	public void windowDeiconified(WindowEvent e) {
		callVoidMathHandler("windowDeiconified", new Object[]{e});
	}

	public void windowIconified(WindowEvent e) {
		callVoidMathHandler("windowIconified", new Object[]{e});
	}

	public void windowOpened(WindowEvent e) {
		callVoidMathHandler("windowOpened", new Object[]{e});
	}

}
