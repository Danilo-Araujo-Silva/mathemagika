package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BayesianMinimizationObject
 *
 * Full name:        System`BayesianMinimizationObject
 *
 * Usage:            BayesianMinimizationObject[…] represents the result of a Bayesian minimization process.
 *
 *                   AssumeDeterministic -> False
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   GPModelPreviousRun -> {}
 *                   InitialEvaluationHistory -> None
 *                   InitialEvaluationNumber -> 2
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   PredictMethod -> {GaussianProcess, AssumeDeterministic -> False, OptimizationMethod -> SimulatedAnnealing}
 *                   RandomSeeding -> 1234
 * Options:          TimeConstraint -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BayesianMinimizationObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/BayesianMinimizationObject.html
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
fun bayesianMinimizationObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BayesianMinimizationObject", arguments.toMutableList(), options)
}
