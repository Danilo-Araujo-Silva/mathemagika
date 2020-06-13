package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindPath
 *
 * Full name:        System`FindPath
 *
 *                   FindPath[g, s, t] finds a path between vertex s and vertex t in the graph g.
 *                   FindPath[g, s, t, k] finds a path of length at most k between vertex s and vertex t in the graph g.
 *                   FindPath[g, s, t, {k}] finds a path of length exactly k.
 *                   FindPath[g, s, t, {k   , k   }] finds a path of length between k    and k   .
 *                                       min   max                                   min      max
 *                   FindPath[g, s, t, kspec, n] finds at most n paths.
 * Usage:            FindPath[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindPath.html
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
fun findPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindPath", arguments.toMutableList(), options)
}
