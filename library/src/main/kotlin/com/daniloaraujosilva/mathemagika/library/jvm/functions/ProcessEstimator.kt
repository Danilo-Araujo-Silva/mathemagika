package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessEstimator
 *
 * Full name:        System`ProcessEstimator
 *
 * Usage:            ProcessEstimator is an option to EstimatedProcess and FindProcessParameters that specifies what process parameter estimator to use.
 *
 *                   AccuracyGoal -> Automatic
 *                   IncludeHiddenStates -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   StateData -> Automatic
 *                   Window -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProcessEstimator
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessEstimator.html
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
fun processEstimator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessEstimator", arguments.toMutableList(), options)
}
