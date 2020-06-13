package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ClusterClassify
 *
 * Full name:        System`ClusterClassify
 *
 *                   ClusterClassify[data] generates a ClassifierFunction[…] by partitioning data into clusters of similar elements.
 * Usage:            ClusterClassify[data, n] generates a ClassifierFunction[…] with at most n clusters.
 *
 *                   CriterionFunction -> Automatic
 *                   DistanceFunction -> Automatic
 *                   DropAnomalies -> False
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   ImputeMissingValues -> Automatic
 *                   IndeterminateThreshold -> 0.
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   RandomSeeding -> 1234
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ClusterClassify
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClusterClassify.html
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
fun clusterClassify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClusterClassify", arguments.toMutableList(), options)
}
