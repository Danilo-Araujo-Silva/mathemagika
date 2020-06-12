package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GreaterEqual
 *
 * Full name:        System`GreaterEqual
 *
 *                   x >= y or x ≥ y yields True if x is determined to be greater than or equal to y.
 *                   x  ≥ x  ≥ x  yields True if the x  form a nonincreasing sequence.
 * Usage:             1    2    3                     i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GreaterEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterEqual.html
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
fun greaterEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterEqual", arguments.toMutableList(), options)
}
