package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindKPlex
 *
 * Full name:        System`FindKPlex
 *
 *                   FindKPlex[g, k] finds a largest k-plex in the graph g.
 *                   FindKPlex[g, k, n] finds a k-plex containing at most n vertices.
 *                   FindKPlex[g, k, {n}] finds a k-plex containing exactly n vertices.
 *                   FindKPlex[g, k, {n   , n   }] finds a k-plex containing between n    and n    vertices.
 *                                     min   max                                      min      max
 *                   FindKPlex[g, k, nspec, s] finds at most s k-plexes.
 *                   FindKPlex[{g, v}, k, …] finds k-plexes that include the vertex v only.
 * Usage:            FindKPlex[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindKPlex
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindKPlex.html
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
fun findKPlex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindKPlex", arguments.toMutableList(), options)
}
