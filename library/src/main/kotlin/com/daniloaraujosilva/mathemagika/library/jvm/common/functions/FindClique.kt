package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindClique
 *
 * Full name:        System`FindClique
 *
 *                   FindClique[g] finds a largest clique in the graph g.
 *                   FindClique[g, n] finds a clique containing at most n vertices.
 *                   FindClique[g, {n}] finds a clique containing exactly n vertices.
 *                   FindClique[g, {n   , n   }] finds a clique containing between n    and n    vertices.
 *                                   min   max                                      min      max
 *                   FindClique[g, nspec, s] finds at most s cliques.
 *                   FindClique[{g, v}, …] finds cliques that include the vertex v only.
 * Usage:            FindClique[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindClique
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindClique.html
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
fun findClique(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindClique", arguments.toMutableList(), options)
}
