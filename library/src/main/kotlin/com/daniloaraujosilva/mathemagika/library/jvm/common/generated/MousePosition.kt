package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MousePosition
 * 
 * Full name:        System`MousePosition
 * 
 *                   MousePosition[] gives the current mouse position in the notebook front end. 
 *                   MousePosition["coords"] gives the mouse position with respect to the specified coordinate system.
 * Usage:            MousePosition["coords", def] returns def if the mouse is not over an object that defines the specified coordinate system.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MousePosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/MousePosition.html
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
fun mousePosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MousePosition", arguments.toMutableList(), options)
}
