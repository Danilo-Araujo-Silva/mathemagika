package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ActivePredictionObject
 *
 * Full name:        System`ActivePredictionObject
 *
 * Usage:            ActivePredictionObject[…] represents the result of an ActivePrediction process.
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
 *                   local: paclet:ref/ActivePredictionObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ActivePredictionObject.html
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
fun activePredictionObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ActivePredictionObject", arguments.toMutableList(), options)
}
