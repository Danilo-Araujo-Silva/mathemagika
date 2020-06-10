package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BayesianMaximizationObject
 * 
 * Full name:        System`BayesianMaximizationObject
 * 
 * Usage:            BayesianMaximizationObject[…] represents the result of a Bayesian maximization process.
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
 *                   local: paclet:ref/BayesianMaximizationObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/BayesianMaximizationObject.html
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
fun bayesianMaximizationObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BayesianMaximizationObject", arguments.toMutableList(), options)
}
