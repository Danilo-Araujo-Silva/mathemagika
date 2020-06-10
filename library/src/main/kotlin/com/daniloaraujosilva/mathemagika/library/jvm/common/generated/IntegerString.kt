package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IntegerString
 * 
 * Full name:        System`IntegerString
 * 
 *                   IntegerString[n] gives a string consisting of the decimal digits in the integer n. 
 *                   IntegerString[n, b] gives a string consisting of the base-b digits in the integer n. 
 *                   IntegerString[n, b, len] pads the string on the left with zero digits to give a string of length len. 
 *                   IntegerString[n, MixedRadix[blist]] uses the mixed radix with a list of bases blist.
 * Usage:            IntegerString[n, "numsys"] gives the numeral form of n based on the numeric system defined by "numsys".
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/IntegerString
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerString.html
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
fun integerString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerString", arguments.toMutableList(), options)
}
