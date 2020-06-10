package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VertexDiceSimilarity
 * 
 * Full name:        System`VertexDiceSimilarity
 * 
 *                   VertexDiceSimilarity[g, u, v] gives the Dice similarity between vertices u and v of the graph g.
 * Usage:            VertexDiceSimilarity[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VertexDiceSimilarity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexDiceSimilarity.html
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
fun vertexDiceSimilarity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexDiceSimilarity", arguments.toMutableList(), options)
}
