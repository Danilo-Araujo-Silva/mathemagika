package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LQGRegulator
 *
 * Full name:        System`LQGRegulator
 *
 *                   LQGRegulator[{ssm, sensors, finputs}, {w, v, h}, {q, r, p}] constructs the optimal feedback regulator for the StateSpaceModel ssm using noisy measurements sensors and feedback inputs finputs. The process, measurement, and cross-covariance matrices are w, v, and h; and the state, input, and state-input weighting matrices are q, r, and p.
 * Usage:            LQGRegulator[{ssm, sensors, finputs, einputs}, {…}, {…}] specifies einputs as the exogenous deterministic inputs.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LQGRegulator
 * Documentation:    web: http://reference.wolfram.com/language/ref/LQGRegulator.html
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
fun lQGRegulator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LQGRegulator", arguments.toMutableList(), options)
}
