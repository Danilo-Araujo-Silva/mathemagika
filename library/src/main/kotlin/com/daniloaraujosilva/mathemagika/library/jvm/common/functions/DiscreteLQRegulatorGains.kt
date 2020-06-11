package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteLQRegulatorGains
 *
 * Full name:        System`DiscreteLQRegulatorGains
 *
 *                   DiscreteLQRegulatorGains[ssm, {q, r}, τ] gives the optimal discrete-time state feedback gain matrix with sampling period τ for the continuous-time StateSpaceModel ssm and the quadratic cost function, with state and control weighting matrices q and r.
 *                   DiscreteLQRegulatorGains[ssm, {q, r, p}, τ] includes the state-control cross-coupling matrix p in the cost function.
 * Usage:            DiscreteLQRegulatorGains[{ssm, finputs}, {…}, τ] specifies the feedback inputs of ssm.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteLQRegulatorGains
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteLQRegulatorGains.html
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
fun discreteLQRegulatorGains(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteLQRegulatorGains", arguments.toMutableList(), options)
}
