package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleDownArrow
 *
 * Full name:        System`DoubleDownArrow
 *
 * Usage:            DoubleDownArrow[x, y, …] displays as x ⇓ y….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleDownArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleDownArrow.html
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
fun doubleDownArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleDownArrow", arguments.toMutableList(), options)
}
