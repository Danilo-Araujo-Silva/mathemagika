package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexEccentricity
 *
 * Full name:        System`VertexEccentricity
 *
 *                   VertexEccentricity[g, s] gives the length of the longest shortest path from the source s to every other vertex in the graph g.
 * Usage:            VertexEccentricity[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexEccentricity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexEccentricity.html
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
fun vertexEccentricity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexEccentricity", arguments.toMutableList(), options)
}
