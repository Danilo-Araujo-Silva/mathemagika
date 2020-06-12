package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexOutDegree
 *
 * Full name:        System`VertexOutDegree
 *
 *                   VertexOutDegree[g] gives the list of vertex out-degrees for all vertices in the graph g.
 *                   VertexOutDegree[g, v] gives the vertex out-degree for the vertex v.
 * Usage:            VertexOutDegree[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexOutDegree
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexOutDegree.html
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
fun vertexOutDegree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexOutDegree", arguments.toMutableList(), options)
}
