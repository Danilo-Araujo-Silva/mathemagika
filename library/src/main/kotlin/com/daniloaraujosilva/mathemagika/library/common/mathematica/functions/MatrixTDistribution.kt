package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixTDistribution
 *
 * Full name:        System`MatrixTDistribution
 *
 *                   MatrixTDistribution[Σ   , Σ   , ν] represents zero mean matrix t distribution with row covariance matrix Σ   , column covariance matrix Σ   , and degrees of freedom parameter ν.
 *                                        row   col                                                                            row                            col
 *                   MatrixTDistribution[μ, Σ   , Σ   , ν] represents matrix t distribution with mean matrix μ.
 * Usage:                                    row   col
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MatrixTDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixTDistribution.html
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
fun matrixTDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixTDistribution", arguments.toMutableList(), options)
}
