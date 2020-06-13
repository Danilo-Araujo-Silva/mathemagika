package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AiryAiPrime
 *
 * Full name:        System`AiryAiPrime
 *
 *                                                                              ′
 * Usage:            AiryAiPrime[z] gives the derivative of the Airy function Ai (z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AiryAiPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/AiryAiPrime.html
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
fun airyAiPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AiryAiPrime", arguments.toMutableList(), options)
}
