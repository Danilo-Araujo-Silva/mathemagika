package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GaussianFilter
 *
 * Full name:        System`GaussianFilter
 *
 *                   GaussianFilter[data, r] filters data by convolving with a Gaussian kernel of radius r.
 *                                                                                                        th
 *                   GaussianFilter[data, r, {n , n , …}] convolves data with a kernel formed from the n    derivatives of the discrete Gaussian.
 *                                             1   2                                                    i
 *                   GaussianFilter[data, {r, σ}, …]  uses a Gaussian kernel with radius r and standard deviation σ.
 *                   GaussianFilter[data, {{r , r , …}, …}] uses radius r  at level i in data.
 * Usage:                                    1   2                       i
 *
 *                   Method -> Bessel
 *                   Padding -> Fixed
 *                   Standardized -> True
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaussianFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaussianFilter.html
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
fun gaussianFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaussianFilter", arguments.toMutableList(), options)
}
