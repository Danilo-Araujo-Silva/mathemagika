package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IntegerDigits
 *
 * Full name:        System`IntegerDigits
 *
 *                   IntegerDigits[n] gives a list of the decimal digits in the integer n.
 *                   IntegerDigits[n, b] gives a list of the base b digits in the integer n.
 *                   IntegerDigits[n, b, len] pads the list on the left with zeros to give a list of length len.
 * Usage:            IntegerDigits[n, MixedRadix[blist]] uses the mixed radix with list of bases blist.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntegerDigits
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerDigits.html
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
fun integerDigits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerDigits", arguments.toMutableList(), options)
}
