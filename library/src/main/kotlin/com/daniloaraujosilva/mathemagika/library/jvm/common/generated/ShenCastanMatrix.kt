package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ShenCastanMatrix
 * 
 * Full name:        System`ShenCastanMatrix
 * 
 *                   ShenCastanMatrix[r] gives a matrix that corresponds to an exponential kernel of radius r. 
 *                   ShenCastanMatrix[{r, σ}] gives a matrix corresponding to an exponential kernel with radius r and region of support specified by σ.
 *                                                                                   th                                                               th
 *                   ShenCastanMatrix[r, {n , n }] gives a matrix formed from the n    derivative of the exponential with respect to rows and the n    derivative with respect to columns.
 *                                         1   2                                   1                                                                2
 *                   ShenCastanMatrix[r, {{n  , n  }, {n  , n  }, …}] gives a matrix formed from the sums of the n   and n   derivatives.
 *                                          11   12     21   22                                                   i1      i2
 *                                                                                                                                       th
 *                   ShenCastanMatrix[{{r , r , …}, σ}, …] gives an array corresponding to an exponential kernel with radius r  in the i   index direction.
 * Usage:                                1   2                                                                                i
 * 
 *                   Standardized -> True
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ShenCastanMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShenCastanMatrix.html
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
fun shenCastanMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShenCastanMatrix", arguments.toMutableList(), options)
}
