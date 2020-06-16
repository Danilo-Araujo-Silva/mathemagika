package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WinsorizedVariance
 *
 * Full name:        System`WinsorizedVariance
 *
 *                   WinsorizedVariance[list, f] gives the variance of the elements in list after replacing the fraction f of the smallest and largest elements by the remaining extreme values.
 *                   WinsorizedVariance[list, {f , f }] gives the variance when the fraction f  of the smallest elements and the fraction f  of the largest elements are replaced by the remaining extreme values.
 *                                              1   2                                         1                                            2
 *                   WinsorizedVariance[list] gives the 5% winsorized variance WinsorizedVariance[list, 0.05].
 * Usage:            WinsorizedVariance[dist, …] gives the winsorized variance of a univariate distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WinsorizedVariance
 * Documentation:    web: http://reference.wolfram.com/language/ref/WinsorizedVariance.html
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
fun winsorizedVariance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WinsorizedVariance", arguments.toMutableList(), options)
}
