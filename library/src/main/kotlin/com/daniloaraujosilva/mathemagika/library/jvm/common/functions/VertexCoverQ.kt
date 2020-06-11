package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexCoverQ
 *
 * Full name:        System`VertexCoverQ
 *
 * Usage:            VertexCoverQ[g, vlist] yields True if the vertex list vlist is a vertex cover of the graph g, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexCoverQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexCoverQ.html
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
fun vertexCoverQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexCoverQ", arguments.toMutableList(), options)
}
