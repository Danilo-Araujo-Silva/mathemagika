package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VarianceEstimatorFunction
 *
 * Full name:        System`VarianceEstimatorFunction
 *
 * Usage:            VarianceEstimatorFunction is an option for LinearModelFit and NonlinearModelFit which specifies the variance estimator to use.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VarianceEstimatorFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/VarianceEstimatorFunction.html
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
fun varianceEstimatorFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VarianceEstimatorFunction", arguments.toMutableList(), options)
}
