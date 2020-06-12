package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CovarianceEstimatorFunction
 *
 * Full name:        System`CovarianceEstimatorFunction
 *
 * Usage:            CovarianceEstimatorFunction is an option for generalized linear model fitting functions that specifies the estimator for the parameter covariance matrix.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CovarianceEstimatorFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CovarianceEstimatorFunction.html
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
fun covarianceEstimatorFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CovarianceEstimatorFunction", arguments.toMutableList(), options)
}
