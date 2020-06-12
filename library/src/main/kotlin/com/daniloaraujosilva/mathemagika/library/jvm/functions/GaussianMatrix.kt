package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaussianMatrix
 *
 * Full name:        System`GaussianMatrix
 *
 *                   GaussianMatrix[r] gives a matrix that corresponds to a Gaussian kernel of radius r.
 *                   GaussianMatrix[{r, σ}] gives a matrix corresponding to a Gaussian kernel with radius r and standard deviation σ.
 *                                                                                 th                                                            th
 *                   GaussianMatrix[r, {n , n }] gives a matrix formed from the n    derivative of the Gaussian with respect to rows and the n    derivative with respect to columns.
 *                                       1   2                                   1                                                             2
 *                   GaussianMatrix[r, {{n  , n  }, {n  , n  }, …}] gives a matrix formed from the sums of the n   and n   derivatives.
 *                                        11   12     21   22                                                   i1      i2
 *                                                                                                                                 th
 *                   GaussianMatrix[{{r , r , …}, σ}, …] gives an array corresponding to a Gaussian kernel with radius r  in the i   index direction.
 * Usage:                              1   2                                                                            i
 *
 *                   Method -> Bessel
 *                   Standardized -> True
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaussianMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaussianMatrix.html
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
fun gaussianMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaussianMatrix", arguments.toMutableList(), options)
}
