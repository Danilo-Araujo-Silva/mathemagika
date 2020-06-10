package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RealDigits
 * 
 * Full name:        System`RealDigits
 * 
 *                   RealDigits[x] gives a list of the digits in the approximate real number x, together with the number of digits that are to the left of the decimal point. 
 *                   RealDigits[x, b] gives a list of base‐b digits in x. 
 *                   RealDigits[x, b, len] gives a list of len digits. 
 *                                                                                               n
 * Usage:            RealDigits[x, b, len, n] gives len digits starting with the coefficient of b . 
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RealDigits
 * Documentation:    web: http://reference.wolfram.com/language/ref/RealDigits.html
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
fun realDigits(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RealDigits", arguments.toMutableList(), options)
}
