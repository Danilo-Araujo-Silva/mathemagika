package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WinsorizedMean
 * 
 * Full name:        System`WinsorizedMean
 * 
 *                   WinsorizedMean[list, f] gives the mean of the elements in list after replacing the fraction f of the smallest and largest elements by the remaining extreme values.
 *                   WinsorizedMean[list, {f , f }] gives the mean when the fraction f  of the smallest elements and the fraction f  of the largest elements are replaced by the remaining extreme values.
 *                                          1   2                                     1                                            2
 *                   WinsorizedMean[list] gives the 5% winsorized mean WinsorizedMean[list, 0.05].
 * Usage:            WinsorizedMean[dist, …] gives the winsorized mean of a univariate distribution dist.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WinsorizedMean
 * Documentation:    web: http://reference.wolfram.com/language/ref/WinsorizedMean.html
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
fun winsorizedMean(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WinsorizedMean", arguments.toMutableList(), options)
}
