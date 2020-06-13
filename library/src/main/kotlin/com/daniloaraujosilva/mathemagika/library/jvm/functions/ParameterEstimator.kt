package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ParameterEstimator
 *
 * Full name:        System`ParameterEstimator
 *
 * Usage:            ParameterEstimator is an option to EstimatedDistribution and FindDistributionParameters that specifies what parameter estimator to use.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParameterEstimator
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParameterEstimator.html
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
fun parameterEstimator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParameterEstimator", arguments.toMutableList(), options)
}
