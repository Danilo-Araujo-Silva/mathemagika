package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AiryBiZero
 *
 * Full name:        System`AiryBiZero
 *
 *                                                  th
 *                   AiryBiZero[k] represents the k   zero of the Airy function Bi(x).
 *                                                      th
 *                   AiryBiZero[k, x ] represents the k   zero less than x .
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
 *                   local: paclet:ref/AiryBiZero
 * Documentation:    web: http://reference.wolfram.com/language/ref/AiryBiZero.html
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
fun airyBiZero(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AiryBiZero", arguments.toMutableList(), options)
}
