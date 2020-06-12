package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StateOutputEstimator
 *
 * Full name:        System`StateOutputEstimator
 *
 *                   StateOutputEstimator[ssm, l] constructs an estimator for the StateSpaceModel ssm, with estimator gain matrix l.
 *                   StateOutputEstimator[{ssm, sensors}, l] uses only sensors as the measurements of ssm.
 * Usage:            StateOutputEstimator[{ssm, sensors, dinputs}, l] specifies dinputs as the deterministic inputs of ssm.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StateOutputEstimator
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateOutputEstimator.html
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
fun stateOutputEstimator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateOutputEstimator", arguments.toMutableList(), options)
}
