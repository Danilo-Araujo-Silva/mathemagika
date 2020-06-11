package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixNormalDistribution
 *
 * Full name:        System`MatrixNormalDistribution
 *
 *                   MatrixNormalDistribution[Σ   , Σ   ] represents zero mean matrix normal distribution with row covariance matrix Σ    and column covariance matrix Σ   .
 *                                             row   col                                                                              row                               col
 *                   MatrixNormalDistribution[μ, Σ   , Σ   ] represents matrix normal distribution with mean matrix μ.
 * Usage:                                         row   col
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MatrixNormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixNormalDistribution.html
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
fun matrixNormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixNormalDistribution", arguments.toMutableList(), options)
}
