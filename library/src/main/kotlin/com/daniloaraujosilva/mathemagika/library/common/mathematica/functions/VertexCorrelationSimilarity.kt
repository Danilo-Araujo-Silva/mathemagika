package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VertexCorrelationSimilarity
 *
 * Full name:        System`VertexCorrelationSimilarity
 *
 *                   VertexCorrelationSimilarity[g, u, v] gives the correlation similarity between vertices u and v of the graph g.
 * Usage:            VertexCorrelationSimilarity[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VertexCorrelationSimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexCorrelationSimilarity.html
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
fun vertexCorrelationSimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexCorrelationSimilarity", arguments.toMutableList(), options)
}
