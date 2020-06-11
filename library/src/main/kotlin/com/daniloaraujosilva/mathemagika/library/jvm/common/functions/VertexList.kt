package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexList
 *
 * Full name:        System`VertexList
 *
 *                   VertexList[g] gives the list of vertices for the graph g.
 *                   VertexList[g, patt] gives a list of vertices that match the pattern patt.
 * Usage:            VertexList[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexList
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexList.html
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
fun vertexList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexList", arguments.toMutableList(), options)
}
