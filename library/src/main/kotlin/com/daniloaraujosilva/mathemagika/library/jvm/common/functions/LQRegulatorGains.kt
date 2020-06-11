package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LQRegulatorGains
 *
 * Full name:        System`LQRegulatorGains
 *
 *                   LQRegulatorGains[ssm, {q, r}] gives the optimal state feedback gain matrix for the StateSpaceModel ssm and the quadratic cost function, with state and control weighting matrices q and r.
 *                   LQRegulatorGains[ssm, {q, r, p}] includes the state-control cross-coupling matrix p in the cost function.
 * Usage:            LQRegulatorGains[{ssm, finputs}, {…}] specifies finputs as the feedback inputs of ssm.
 *
 *                   EstimatorType -> None
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LQRegulatorGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/LQRegulatorGains.html
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
fun lQRegulatorGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LQRegulatorGains", arguments.toMutableList(), options)
}
