package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindVertexCover
 *
 * Full name:        System`FindVertexCover
 *
 *                   FindVertexCover[g] finds a vertex cover of the graph g with a minimum number of vertices.
 * Usage:            FindVertexCover[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindVertexCover
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindVertexCover.html
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
fun findVertexCover(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindVertexCover", arguments.toMutableList(), options)
}
