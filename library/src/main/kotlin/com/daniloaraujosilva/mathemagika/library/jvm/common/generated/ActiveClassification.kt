package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ActiveClassification
 * 
 * Full name:        System`ActiveClassification
 * 
 *                   ActiveClassification[f, {conf , conf , …}] gives an object representing the result of active classification obtained by using the function f to determine classes for the example configurations conf . 
 *                                                1      2                                                                                                                                                                i
 *                   ActiveClassification[f, reg] generates configurations within the region specified by reg.
 *                   ActiveClassification[f, sampler] generates configurations by applying the function sampler.
 *                   ActiveClassification[f, {conf , conf , …}  nsampler] applies the function nsampler to successively generate configurations starting from one of the conf .
 * Usage:                                         1      2                                                                                                                    i
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
 *                   local: paclet:ref/ActiveClassification
 * Documentation:    web: http://reference.wolfram.com/language/ref/ActiveClassification.html
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
fun activeClassification(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ActiveClassification", arguments.toMutableList(), options)
}
