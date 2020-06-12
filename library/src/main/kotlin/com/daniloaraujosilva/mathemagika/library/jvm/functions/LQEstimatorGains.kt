package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LQEstimatorGains
 *
 * Full name:        System`LQEstimatorGains
 *
 *                   LQEstimatorGains[ssm, {w, v}] gives the optimal estimator gain matrix for the StateSpaceModel ssm, with process and measurement noise covariance matrices w and v.
 *                   LQEstimatorGains[ssm, {w, v, h}] includes the cross-covariance matrix h.
 *                   LQEstimatorGains[{ssm, sensors}, {…}] specifies sensors as the noisy measurements of ssm.
 * Usage:            LQEstimatorGains[{ssm, sensors, dinputs}, {…}] specifies dinputs as the deterministic inputs of ssm.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LQEstimatorGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/LQEstimatorGains.html
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
fun lQEstimatorGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LQEstimatorGains", arguments.toMutableList(), options)
}
