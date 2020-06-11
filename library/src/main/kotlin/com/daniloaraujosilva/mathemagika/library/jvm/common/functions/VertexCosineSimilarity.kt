package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexCosineSimilarity
 *
 * Full name:        System`VertexCosineSimilarity
 *
 *                   VertexCosineSimilarity[g, u, v] gives the cosine similarity between vertices u and v of the graph g.
 * Usage:            VertexCosineSimilarity[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VertexCosineSimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexCosineSimilarity.html
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
fun vertexCosineSimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexCosineSimilarity", arguments.toMutableList(), options)
}
