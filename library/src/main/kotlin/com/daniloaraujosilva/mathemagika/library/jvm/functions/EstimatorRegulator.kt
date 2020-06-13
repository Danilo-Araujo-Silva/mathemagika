package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EstimatorRegulator
 *
 * Full name:        System`EstimatorRegulator
 *
 *                   EstimatorRegulator[ssm, {l, κ}] constructs the feedback regulator for the StateSpaceModel ssm with estimator and feedback gain matrices l and κ, respectively.
 *                   EstimatorRegulator[{ssm, sensors}, {l, κ}] uses only sensors as the measured outputs of ssm.
 *                   EstimatorRegulator[{ssm, sensors, finputs}, {l, κ}] specifies finputs as the feedback inputs of ssm.
 * Usage:            EstimatorRegulator[{ssm, sensors, finputs, einputs}, {l, κ}] specifies einputs as the exogenous deterministic inputs.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EstimatorRegulator
 * Documentation:    web: http://reference.wolfram.com/language/ref/EstimatorRegulator.html
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
fun estimatorRegulator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EstimatorRegulator", arguments.toMutableList(), options)
}
