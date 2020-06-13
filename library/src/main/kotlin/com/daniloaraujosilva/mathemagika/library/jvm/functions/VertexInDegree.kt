package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VertexInDegree
 *
 * Full name:        System`VertexInDegree
 *
 *                   VertexInDegree[g] gives the list of vertex in-degrees for all vertices in the graph g.
 *                   VertexInDegree[g, v] gives the vertex in-degree for the vertex v.
 * Usage:            VertexInDegree[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexInDegree
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexInDegree.html
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
fun vertexInDegree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexInDegree", arguments.toMutableList(), options)
}
