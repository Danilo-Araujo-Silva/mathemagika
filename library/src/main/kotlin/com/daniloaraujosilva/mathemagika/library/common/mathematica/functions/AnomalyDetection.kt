package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AnomalyDetection
 *
 * Full name:        System`AnomalyDetection
 *
 *                   AnomalyDetection[{example , example , …}] generates an AnomalyDetectorFunction[…] based on the examples given.
 *                                            1         2
 *                   AnomalyDetection[LearnedDistribution[…]] generates an anomaly detector based on the given distribution.
 *                   AnomalyDetection[ True  {example  , example  , …}, False  {example  , …} ] can be used to indicate which examples should be considered anomalous.
 * Usage:                                              11         12                      21
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
 *                   local: paclet:ref/AnomalyDetection
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnomalyDetection.html
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
fun anomalyDetection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnomalyDetection", arguments.toMutableList(), options)
}
