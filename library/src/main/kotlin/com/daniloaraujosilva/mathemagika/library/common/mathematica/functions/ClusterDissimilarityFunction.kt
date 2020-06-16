package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ClusterDissimilarityFunction
 *
 * Full name:        System`ClusterDissimilarityFunction
 *
 * Usage:            ClusterDissimilarityFunction is an option for ClusteringTree and Dendrogram that specifies the intercluster dissimilarity.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ClusterDissimilarityFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClusterDissimilarityFunction.html
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
fun clusterDissimilarityFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClusterDissimilarityFunction", arguments.toMutableList(), options)
}
