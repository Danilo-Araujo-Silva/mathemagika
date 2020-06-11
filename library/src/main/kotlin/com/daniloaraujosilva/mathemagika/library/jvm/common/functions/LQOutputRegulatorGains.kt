package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LQOutputRegulatorGains
 *
 * Full name:        System`LQOutputRegulatorGains
 *
 *                   LQOutputRegulatorGains[ssm, {q, r}] gives the optimal state feedback gain matrix for the StateSpaceModel ssm and the quadratic cost function, with output and control weighting matrices q and r.
 *                   LQOutputRegulatorGains[ssm, {q, r, p}] includes the output-control cross-coupling matrix p in the cost function.
 *                   LQOutputRegulatorGains[{ssm, sensors}, {…}] specifies sensors as the measured outputs of ssm.
 * Usage:            LQOutputRegulatorGains[{ssm, sensors, finputs}, {…}] specifies finputs as the feedback inputs of ssm.
 *
 *                   EstimatorType -> None
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LQOutputRegulatorGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/LQOutputRegulatorGains.html
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
fun lQOutputRegulatorGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LQOutputRegulatorGains", arguments.toMutableList(), options)
}
