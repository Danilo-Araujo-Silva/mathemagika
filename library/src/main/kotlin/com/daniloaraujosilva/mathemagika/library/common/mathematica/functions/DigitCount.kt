package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DigitCount
 *
 * Full name:        System`DigitCount
 *
 *                   DigitCount[n, b, d] gives the number of d digits in the base-b representation of n.
 *                   DigitCount[n, b] gives a list of the numbers of 1, 2, …, b - 1, 0 digits in the base-b representation of n.
 * Usage:            DigitCount[n] gives a list of the numbers of 1, 2, …, 9, 0 digits in the base-10 representation of n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DigitCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/DigitCount.html
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
fun digitCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DigitCount", arguments.toMutableList(), options)
}
