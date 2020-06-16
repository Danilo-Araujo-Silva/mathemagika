package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BayesianMinimization
 *
 * Full name:        System`BayesianMinimization
 *
 *                   BayesianMinimization[f, {conf , conf , …}] gives an object representing the result of Bayesian minimization of the function f over the configurations conf .
 *                                                1      2                                                                                                                     i
 *                   BayesianMinimization[f, reg] minimizes over the region represented by the region specification reg.
 *                   BayesianMinimization[f, sampler] minimizes over configurations obtained by applying the function sampler.
 *                   BayesianMinimization[f, {conf , conf , …}  nsampler] applies the function nsampler to successively generate configurations starting from the conf .
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
 *                   local: paclet:ref/BayesianMinimization
 * Documentation:    web: http://reference.wolfram.com/language/ref/BayesianMinimization.html
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
fun bayesianMinimization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BayesianMinimization", arguments.toMutableList(), options)
}
