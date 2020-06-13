package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ToBoxes
 *
 * Full name:        System`ToBoxes
 *
 *                   ToBoxes[expr] generates boxes corresponding to the printed form of expr in StandardForm.
 * Usage:            ToBoxes[expr, form] gives the boxes corresponding to output in the specified form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToBoxes
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToBoxes.html
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
fun toBoxes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToBoxes", arguments.toMutableList(), options)
}
