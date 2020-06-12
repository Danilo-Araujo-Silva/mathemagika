package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteLQEstimatorGains
 *
 * Full name:        System`DiscreteLQEstimatorGains
 *
 *                   DiscreteLQEstimatorGains[ssm, {w, v}, τ] gives the optimal discrete-time estimator gain matrix with sampling period τ for the continuous-time StateSpaceModel ssm, with process and measurement noise covariance matrices w and v.
 *                   DiscreteLQEstimatorGains[{ssm, sensors}, {w, v}, τ] specifies sensors as the noisy measurements of ssm.
 * Usage:            DiscreteLQEstimatorGains[{ssm, sensors, dinputs}, {w, v}, τ] specifies dinputs as the deterministic inputs of ssm.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteLQEstimatorGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteLQEstimatorGains.html
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
fun discreteLQEstimatorGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteLQEstimatorGains", arguments.toMutableList(), options)
}
