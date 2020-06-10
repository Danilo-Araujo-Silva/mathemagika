package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClusteringComponents
 * 
 * Full name:        System`ClusteringComponents
 * 
 *                   ClusteringComponents[array] gives an array in which each element at the lowest level of array is replaced by an integer index representing the cluster in which the element lies.
 *                   ClusteringComponents[array, n] finds at most n clusters.
 *                   ClusteringComponents[array, n, level] finds clusters at the specified level in array.
 *                   ClusteringComponents[image] finds clusters of pixels with similar values in image.
 * Usage:            ClusteringComponents[image, n] finds at most n clusters in image.
 * 
 *                   AllowExpressionFeatures -> True
 *                   CriterionFunction -> Automatic
 *                   DistanceFunction -> Automatic
 *                   FeatureExtractor -> Identity
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   IndeterminateThreshold -> 0.
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   RandomSeeding -> 1234
 * Options:          Weights -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ClusteringComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClusteringComponents.html
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
fun clusteringComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClusteringComponents", arguments.toMutableList(), options)
}
