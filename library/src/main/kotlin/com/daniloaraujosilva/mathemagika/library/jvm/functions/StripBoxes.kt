package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StripBoxes
 *
 * Full name:        System`StripBoxes
 *
 * Usage:            StripBoxes[expr] will strip out unnecessary boxes, spaces, and styles from a format expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StripBoxes
 * Documentation:    web: http://reference.wolfram.com/language/ref/StripBoxes.html
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
fun stripBoxes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StripBoxes", arguments.toMutableList(), options)
}
