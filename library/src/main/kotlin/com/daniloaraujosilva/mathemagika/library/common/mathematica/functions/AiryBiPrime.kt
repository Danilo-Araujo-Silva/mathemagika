package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AiryBiPrime
 *
 * Full name:        System`AiryBiPrime
 *
 *                                                                              ′
 * Usage:            AiryBiPrime[z] gives the derivative of the Airy function Bi (z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AiryBiPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/AiryBiPrime.html
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
fun airyBiPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AiryBiPrime", arguments.toMutableList(), options)
}
