package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleUpArrow
 *
 * Full name:        System`DoubleUpArrow
 *
 * Usage:            DoubleUpArrow[x, y, …] displays as x ⇑ y ⇑ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleUpArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleUpArrow.html
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
fun doubleUpArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleUpArrow", arguments.toMutableList(), options)
}
