package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ActivePrediction
 *
 * Full name:        System`ActivePrediction
 *
 *                   ActivePrediction[f, {conf , conf , …}] gives an object representing the result of active prediction obtained by using the function f to determine values for the example configurations conf .
 *                                            1      2                                                                                                                                                           i
 *                   ActivePrediction[f, reg] generates configurations within the region specified by reg.
 *                   ActivePrediction[f, sampler] generates configurations by applying the function sampler.
 *                   ActivePrediction[f, {conf , conf , …}  nsampler] applies the function nsampler to successively generate configurations starting from one of the conf .
 * Usage:                                     1      2                                                                                                                    i
 *
 *                   ClassPriors -> Automatic
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   IndeterminateThreshold -> 0
 *                   InitialEvaluationHistory -> None
 *                   InitialEvaluationNumber -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> MaxEntropy
 *                   PerformanceGoal -> Automatic
 *                   RandomSeeding -> 1234
 *                   ShowTrainingProgress -> True
 *                   TimeConstraint -> Infinity
 *                   UtilityFunction -> Automatic
 * Options:          ValidationSet -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ActivePrediction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ActivePrediction.html
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
fun activePrediction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ActivePrediction", arguments.toMutableList(), options)
}
