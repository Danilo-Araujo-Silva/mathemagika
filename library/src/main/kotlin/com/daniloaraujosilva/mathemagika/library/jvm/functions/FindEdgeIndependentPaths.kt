package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindEdgeIndependentPaths
 *
 * Full name:        System`FindEdgeIndependentPaths
 *
 *                   FindEdgeIndependentPaths[g, s, t, k] finds at most k edge-independent paths from vertex s to vertex t in the graph g.
 * Usage:            FindEdgeIndependentPaths[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindEdgeIndependentPaths
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindEdgeIndependentPaths.html
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
fun findEdgeIndependentPaths(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindEdgeIndependentPaths", arguments.toMutableList(), options)
}
