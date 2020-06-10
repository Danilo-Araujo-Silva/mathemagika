package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NetPairEmbeddingOperator
 * 
 * Full name:        System`NetPairEmbeddingOperator
 * 
 *                   NetPairEmbeddingOperator[net] represents a net that takes a pair of arrays, embeds them into a vector space using net, and outputs the distance under the embedding.
 * Usage:            NetPairEmbeddingOperator[net, opts] includes options for distance function to use and other parameters.
 * 
 *                   DistanceFunction -> EuclideanDistance
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 * Options:          Output -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NetPairEmbeddingOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetPairEmbeddingOperator.html
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
fun netPairEmbeddingOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetPairEmbeddingOperator", arguments.toMutableList(), options)
}
