package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindAnomalies
 *
 * Full name:        System`FindAnomalies
 *
 *                   FindAnomalies[{example , example , …}] gives a list of the example  that are considered anomalous with respect to the other examples.
 *                                         1         2                                 i
 *                   FindAnomalies[examples, prop] gives the specified property related to the anomaly computation.
 *                   FindAnomalies[examples, {prop , prop , …}] gives the properties prop .
 *                                                1      2                               i
 *                   FindAnomalies[fun, data] finds anomalies in data using the given AnomalyDetectorFunction[…] or LearnedDistribution[…].
 * Usage:            FindAnomalies[fun, data, props] gives properties related to the anomaly computation.
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
 *                   local: paclet:ref/FindAnomalies
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindAnomalies.html
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
fun findAnomalies(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindAnomalies", arguments.toMutableList(), options)
}
