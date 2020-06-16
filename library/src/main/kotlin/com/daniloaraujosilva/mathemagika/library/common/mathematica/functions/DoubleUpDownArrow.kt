package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleUpDownArrow
 *
 * Full name:        System`DoubleUpDownArrow
 *
 * Usage:            DoubleUpDownArrow[x, y, …] displays as x ⇕ y ⇕ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleUpDownArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleUpDownArrow.html
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
fun doubleUpDownArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleUpDownArrow", arguments.toMutableList(), options)
}
