package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrimmedVariance
 *
 * Full name:        System`TrimmedVariance
 *
 *                   TrimmedVariance[list, f] gives the variance of the elements in list after dropping a fraction f of the smallest and largest elements.
 *                   TrimmedVariance[list, {f , f }] gives the variance when a fraction f  of the smallest elements and a fraction f  of the largest elements are removed.
 *                                           1   2                                       1                                          2
 *                   TrimmedVariance[list] gives the 5% trimmed variance TrimmedVariance[list, 0.05].
 * Usage:            TrimmedVariance[dist, …] gives the trimmed variance of a univariate distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrimmedVariance
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrimmedVariance.html
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
fun trimmedVariance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrimmedVariance", arguments.toMutableList(), options)
}
