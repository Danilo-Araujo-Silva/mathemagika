package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UndirectedEdge
 *
 * Full name:        System`UndirectedEdge
 *
 *                   UndirectedEdge[u, v] or u  v represents an undirected edge between u and v.
 *                                                t
 * Usage:            UndirectedEdge[u, v, t] or u  v represents an undirected edge between u and v with tag t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UndirectedEdge
 * Documentation:    web: http://reference.wolfram.com/language/ref/UndirectedEdge.html
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
fun undirectedEdge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UndirectedEdge", arguments.toMutableList(), options)
}
