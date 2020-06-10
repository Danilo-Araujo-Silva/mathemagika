package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LaplacianGaussianFilter
 * 
 * Full name:        System`LaplacianGaussianFilter
 * 
 *                   LaplacianGaussianFilter[data, r] convolves data with a Laplacian of Gaussian kernel of pixel radius r.
 * Usage:            LaplacianGaussianFilter[data, {r, σ}]  convolves data with a Laplacian of Gaussian kernel of radius r and standard deviation σ.
 * 
 *                   Method -> Bessel
 *                   Padding -> Fixed
 *                   Standardized -> True
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LaplacianGaussianFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/LaplacianGaussianFilter.html
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
fun laplacianGaussianFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LaplacianGaussianFilter", arguments.toMutableList(), options)
}
