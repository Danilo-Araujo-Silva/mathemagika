package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteAnomalies
 *
 * Full name:        System`DeleteAnomalies
 *
 *                   DeleteAnomalies[{example , example , …}] gives a list in which example  that are considered anomalous have been dropped.
 *                                           1         2                                   i
 * Usage:            DeleteAnomalies[fun, data] drops anomalies in data using the given AnomalyDetectorFunction[…] or LearnedDistribution[…].
 *
 *                   AcceptanceThreshold -> 0.001
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 *                   TargetDevice -> CPU
 *                   TimeGoal -> Automatic
 *                   TrainingProgressReporting -> Automatic
 *                   ValidationSet -> Automatic
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteAnomalies
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteAnomalies.html
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
fun deleteAnomalies(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteAnomalies", arguments.toMutableList(), options)
}
