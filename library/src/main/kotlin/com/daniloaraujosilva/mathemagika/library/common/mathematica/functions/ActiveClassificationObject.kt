package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ActiveClassificationObject
 *
 * Full name:        System`ActiveClassificationObject
 *
 * Usage:            ActiveClassificationObject[…] represents the result of an ActiveClassification process.
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
 *                   local: paclet:ref/ActiveClassificationObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ActiveClassificationObject.html
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
fun activeClassificationObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ActiveClassificationObject", arguments.toMutableList(), options)
}
