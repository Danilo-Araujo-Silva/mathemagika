package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WindowFrameElements
 *
 * Full name:        System`WindowFrameElements
 *
 * Usage:            WindowFrameElements is an option for notebooks that specifies the elements to include in the frame of the window used to display the notebook on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowFrameElements
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowFrameElements.html
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
fun windowFrameElements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowFrameElements", arguments.toMutableList(), options)
}
