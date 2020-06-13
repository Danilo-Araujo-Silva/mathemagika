package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GaborMatrix
 *
 * Full name:        System`GaborMatrix
 *
 *                   GaborMatrix[r, k] gives a matrix that corresponds to the real part of a Gabor kernel of radius r and wave vector k.
 *                   GaborMatrix[r, k, ϕ] uses phase shift ϕ.
 *                   GaborMatrix[{r, σ}, …] uses the specified standard deviation σ.
 *                                                                                                                        th
 *                   GaborMatrix[{{r , r , …}}, …] gives an array corresponding to a Gabor kernel with radius r  in the i   index direction.
 * Usage:                           1   2                                                                      i
 *
 *                   Standardized -> True
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaborMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaborMatrix.html
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
fun gaborMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaborMatrix", arguments.toMutableList(), options)
}
