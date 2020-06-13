package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AdjacencyList
 *
 * Full name:        System`AdjacencyList
 *
 *                   AdjacencyList[g, v] gives a list of vertices adjacent to vertex v.
 *                   AdjacencyList[g, patt] gives a list of vertices adjacent to vertices that match the pattern patt.
 *                   AdjacencyList[g, patt, d] gives a list of vertices that are at distance at most d.
 * Usage:            AdjacencyList[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AdjacencyList
 * Documentation:    web: http://reference.wolfram.com/language/ref/AdjacencyList.html
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
fun adjacencyList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AdjacencyList", arguments.toMutableList(), options)
}
