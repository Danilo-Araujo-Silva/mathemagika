package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexDegree
 *
 * Full name:        System`VertexDegree
 *
 *                   VertexDegree[g] gives the list of vertex degrees for all vertices in the graph g.
 *                   VertexDegree[g, v] gives the vertex degree for the vertex v.
 * Usage:            VertexDegree[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexDegree
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexDegree.html
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
fun vertexDegree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexDegree", arguments.toMutableList(), options)
}
