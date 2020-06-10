package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GraphEmbedding
 * 
 * Full name:        System`GraphEmbedding
 * 
 *                   GraphEmbedding[g] gives coordinates of the vertices of the graph g.
 *                   GraphEmbedding[g, "emb"] gives coordinates of the vertices of the graph g using the embedding "emb".
 * Usage:            GraphEmbedding[g, "emb", dim] gives coordinates in dimension dim of the vertices of the graph g using the embedding "emb".
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/GraphEmbedding
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphEmbedding.html
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
fun graphEmbedding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphEmbedding", arguments.toMutableList(), options)
}
