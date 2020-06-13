package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TrimmedMean
 *
 * Full name:        System`TrimmedMean
 *
 *                   TrimmedMean[list, f] gives the mean of the elements in list after dropping a fraction f of the smallest and largest elements.
 *                   TrimmedMean[list, {f , f }] gives the mean when a fraction f  of the smallest elements and a fraction f  of the largest elements are removed.
 *                                       1   2                                   1                                          2
 *                   TrimmedMean[list] gives the 5% trimmed mean TrimmedMean[list, 0.05].
 * Usage:            TrimmedMean[dist, …] gives the trimmed mean of a univariate distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TrimmedMean
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrimmedMean.html
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
fun trimmedMean(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrimmedMean", arguments.toMutableList(), options)
}
