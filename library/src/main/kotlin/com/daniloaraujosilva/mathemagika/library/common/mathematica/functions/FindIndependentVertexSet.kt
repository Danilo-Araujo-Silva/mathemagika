package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindIndependentVertexSet
 *
 * Full name:        System`FindIndependentVertexSet
 *
 *                   FindIndependentVertexSet[g] finds an independent vertex set of the graph g with a maximum number of vertices.
 *                   FindIndependentVertexSet[g, n] finds an independent vertex set with at most n vertices.
 *                   FindIndependentVertexSet[g, {n}] finds an independent vertex set with exactly n vertices.
 *                   FindIndependentVertexSet[g, {n   , n   }] finds an independent vertex set containing between n    and n    vertices.
 *                                                 min   max                                                       min      max
 *                   FindIndependentVertexSet[g, nspec, s] finds at most s independent vertex sets.
 *                   FindIndependentVertexSet[{g, v}, …] finds independent sets that include the vertex v only.
 * Usage:            FindIndependentVertexSet[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindIndependentVertexSet
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindIndependentVertexSet.html
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
fun findIndependentVertexSet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindIndependentVertexSet", arguments.toMutableList(), options)
}
