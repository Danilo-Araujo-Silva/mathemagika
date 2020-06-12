package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AiryAiZero
 *
 * Full name:        System`AiryAiZero
 *
 *                                                  th
 *                   AiryAiZero[k] represents the k   zero of the Airy function Ai(x).
 *                                                      th
 *                   AiryAiZero[k, x ] represents the k   zero less than x .
 * Usage:                           0                                      0
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AiryAiZero
 * Documentation:    web: http://reference.wolfram.com/language/ref/AiryAiZero.html
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
fun airyAiZero(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AiryAiZero", arguments.toMutableList(), options)
}
