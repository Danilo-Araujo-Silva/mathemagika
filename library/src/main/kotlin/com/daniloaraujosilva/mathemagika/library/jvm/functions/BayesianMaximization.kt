package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BayesianMaximization
 *
 * Full name:        System`BayesianMaximization
 *
 *                   BayesianMaximization[f, {conf , conf , …}] gives an object representing the result of Bayesian maximization over the function f over the configurations conf .
 *                                                1      2                                                                                                                       i
 *                   BayesianMaximization[f, reg] maximizes over the region represented by the region specification reg.
 *                   BayesianMaximization[f, sampler] maximizes over configurations obtained by applying the function sampler.
 *                   BayesianMaximization[f, {conf , conf , …}  nsampler] applies the function nsampler to successively generate configurations starting from the conf .
 * Usage:                                         1      2                                                                                                             i
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
 *                   local: paclet:ref/BayesianMaximization
 * Documentation:    web: http://reference.wolfram.com/language/ref/BayesianMaximization.html
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
fun bayesianMaximization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BayesianMaximization", arguments.toMutableList(), options)
}
