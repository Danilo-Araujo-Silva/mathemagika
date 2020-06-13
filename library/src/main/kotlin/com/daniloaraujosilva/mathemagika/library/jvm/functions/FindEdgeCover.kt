package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindEdgeCover
 *
 * Full name:        System`FindEdgeCover
 *
 *                   FindEdgeCover[g] finds an edge cover of the graph g with a minimum number of edges.
 * Usage:            FindEdgeCover[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindEdgeCover
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindEdgeCover.html
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
fun findEdgeCover(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindEdgeCover", arguments.toMutableList(), options)
}
