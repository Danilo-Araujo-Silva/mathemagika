package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TouchPosition
 * 
 * Full name:        System`TouchPosition
 * 
 *                   TouchPosition[] gives the list of current positions being touched in the notebook front end.
 *                   TouchPosition["coords"] gives the touch positions with respect to the specified coordinate system.
 *                                                                          th
 *                   TouchPosition["coords", n] gives the position of the n   position being touched in an object in the specified coordinate system.
 * Usage:            TouchPosition["coords", n, def] returns def if there are not n positions being touched.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TouchPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/TouchPosition.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun touchPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TouchPosition", arguments.toMutableList(), options)
}
