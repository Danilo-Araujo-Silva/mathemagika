package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindKClan
 *
 * Full name:        System`FindKClan
 *
 *                   FindKClan[g, k] finds a largest k-clan in the graph g.
 *                   FindKClan[g, k, n] finds a k-clan containing at most n vertices.
 *                   FindKClan[g, k, {n}] finds a k-clan containing exactly n vertices.
 *                   FindKClan[g, k, {n   , n   }] finds a k-clan containing between n    and n    vertices.
 *                                     min   max                                      min      max
 *                   FindKClan[g, k, nspec, s] finds at most s k-clans.
 *                   FindKClan[{g, v}, k, …] finds k-clans that include the vertex v only.
 * Usage:            FindKClan[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindKClan
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindKClan.html
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
fun findKClan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindKClan", arguments.toMutableList(), options)
}
