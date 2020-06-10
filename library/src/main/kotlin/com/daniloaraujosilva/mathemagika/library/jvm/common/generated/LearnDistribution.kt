package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LearnDistribution
 * 
 * Full name:        System`LearnDistribution
 * 
 *                   LearnDistribution[{example , example , …}] generates a LearnedDistribution[…] that attempts to represent an underlying distribution for the examples given.
 * Usage:                                      1         2
 * 
 *                   BatchProcessing -> Automatic
 *                   ComputedPropertiesMinSampleNumber -> 10
 *                   FeatureExtractor -> None
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   ImputeMissingValues -> True
 *                   Method -> Automatic
 *                   MinimalPreprocessing -> False
 *                   OutputWrapper -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> True
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 *                   TargetDevice -> CPU
 *                   TimeGoal -> Automatic
 *                   TrainingProgressCheckpointing -> None
 *                   TrainingProgressReporting -> Automatic
 *                   TrainingSizeRatio -> Automatic
 *                   ValidationSet -> Automatic
 * Options:          Weights -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LearnDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LearnDistribution.html
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
fun learnDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LearnDistribution", arguments.toMutableList(), options)
}
