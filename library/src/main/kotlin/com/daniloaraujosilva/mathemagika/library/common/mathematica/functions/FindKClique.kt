package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindKClique
 *
 * Full name:        System`FindKClique
 *
 *                   FindKClique[g, k] finds a largest k-clique in the graph g.
 *                   FindKClique[g, k, n] finds a k-clique containing at most n vertices.
 *                   FindKClique[g, k, {n}] finds a k-clique containing exactly n vertices.
 *                   FindKClique[g, k, {n   , n   }] finds a k-clique containing between n    and n    vertices.
 *                                       min   max                                        min      max
 *                   FindKClique[g, k, nspec, s] finds at most s k-cliques.
 *                   FindKClique[{g, v}, k, …] finds k-cliques that include the vertex v only.
 * Usage:            FindKClique[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindKClique
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindKClique.html
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
fun findKClique(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindKClique", arguments.toMutableList(), options)
}
