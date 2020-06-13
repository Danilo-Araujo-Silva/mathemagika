package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VertexCount
 *
 * Full name:        System`VertexCount
 *
 *                   VertexCount[g] gives a count of the number of vertices in the graph g.
 *                   VertexCount[g, patt] gives a count of the number of vertices that match the pattern patt.
 * Usage:            VertexCount[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexCount.html
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
fun vertexCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexCount", arguments.toMutableList(), options)
}
