package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CovarianceFunction
 *
 * Full name:        System`CovarianceFunction
 *
 *                   CovarianceFunction[data, hspec] estimates the covariance function at lags hspec from data.
 *                   CovarianceFunction[proc, hspec] represents the covariance function at lags hspec for the random process proc.
 * Usage:            CovarianceFunction[proc, s, t] represents the covariance function at times s and t for the random process proc.
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CovarianceFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CovarianceFunction.html
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
fun covarianceFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CovarianceFunction", arguments.toMutableList(), options)
}
