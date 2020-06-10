package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindClusters
 * 
 * Full name:        System`FindClusters
 * 
 *                   FindClusters[{e , e , …}] partitions the e  into clusters of similar elements. 
 *                                  1   2                      i
 *                   FindClusters[{e   v , e   v , …}] returns the v  corresponding to the e  in each cluster. 
 *                                  1    1   2    2                   i                       i
 *                   FindClusters[{e , e , …}  {v , v , …}] gives the same result. 
 *                                  1   2         1   2
 *                   FindClusters[ label   e , label   e , … ] returns the label  corresponding to the e  in each cluster.
 *                                       1    1       2    2                        i                       i
 * Usage:            FindClusters[data, n] partitions data into at most n clusters. 
 * 
 *                   AllowExpressionFeatures -> True
 *                   CriterionFunction -> Automatic
 *                   DistanceFunction -> Automatic
 *                   DropAnomalies -> False
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
 *                   local: paclet:ref/FindClusters
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindClusters.html
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
fun findClusters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindClusters", arguments.toMutableList(), options)
}
