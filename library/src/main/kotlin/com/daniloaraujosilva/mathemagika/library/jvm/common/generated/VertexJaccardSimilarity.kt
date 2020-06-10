package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VertexJaccardSimilarity
 * 
 * Full name:        System`VertexJaccardSimilarity
 * 
 *                   VertexJaccardSimilarity[g, u, v] gives the Jaccard similarity between vertices u and v of the graph g.
 * Usage:            VertexJaccardSimilarity[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VertexJaccardSimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexJaccardSimilarity.html
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
fun vertexJaccardSimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexJaccardSimilarity", arguments.toMutableList(), options)
}
