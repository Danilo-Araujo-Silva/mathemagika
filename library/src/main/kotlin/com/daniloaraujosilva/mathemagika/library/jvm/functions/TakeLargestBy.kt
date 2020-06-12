package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TakeLargestBy
 *
 * Full name:        System`TakeLargestBy
 *
 *                   TakeLargestBy[list, f, n] gives the n elements e  in list for which f[e ] is largest, sorted in descending order.
 *                                                                   i                      i
 *                   TakeLargestBy[list  prop, f, n] gives the property prop for the n elements in list for which f[e ] is largest.
 *                                                                                                                    i
 * Usage:            TakeLargestBy[f, n] represents an operator form of TakeLargestBy that can be applied to an expression.
 *
 * Options:          ExcludedForms -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TakeLargestBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeLargestBy.html
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
fun takeLargestBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeLargestBy", arguments.toMutableList(), options)
}
