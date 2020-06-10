package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KalmanEstimator
 * 
 * Full name:        System`KalmanEstimator
 * 
 *                   KalmanEstimator[ssm, {w, v}] constructs the Kalman estimator for the StateSpaceModel ssm with process and measurement noise covariance matrices w and v. 
 *                   KalmanEstimator[ssm, {w, v, h}] includes the cross-covariance matrix h.
 *                   KalmanEstimator[{ssm, sensors}, {…}] specifies sensors as the noisy measurements of ssm.
 * Usage:            KalmanEstimator[{ssm, sensors, dinputs}, {…}] specifies dinputs as the deterministic inputs of ssm.
 * 
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/KalmanEstimator
 * Documentation:    web: http://reference.wolfram.com/language/ref/KalmanEstimator.html
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
fun kalmanEstimator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KalmanEstimator", arguments.toMutableList(), options)
}
