package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DirectedEdge
 *
 * Full name:        System`DirectedEdge
 *
 *                   DirectedEdge[u, v] or u  v represents a directed edge from u to v.
 *                                              t
 * Usage:            DirectedEdge[u, v, t] or u  v represents a directed edge from u to v with tag t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DirectedEdge
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirectedEdge.html
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
fun directedEdge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirectedEdge", arguments.toMutableList(), options)
}
