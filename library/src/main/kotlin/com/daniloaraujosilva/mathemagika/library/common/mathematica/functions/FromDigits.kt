package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FromDigits
 *
 * Full name:        System`FromDigits
 *
 *                   FromDigits[list] constructs an integer from the list of its decimal digits.
 *                   FromDigits[list, b] takes the digits to be given in base b.
 *                   FromDigits[list, MixedRadix[blist]] uses the mixed radix with list of bases blist.
 *                   FromDigits["string"] constructs an integer from a string of digits.
 * Usage:            FromDigits["string", "Roman"] constructs an integer from Roman numerals.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FromDigits
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromDigits.html
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
fun fromDigits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromDigits", arguments.toMutableList(), options)
}
