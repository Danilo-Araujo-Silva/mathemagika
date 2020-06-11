package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeightedAdjacencyMatrix
 *
 * Full name:        System`WeightedAdjacencyMatrix
 *
 *                   WeightedAdjacencyMatrix[g] gives the adjacency matrix of edge weights of the graph g.
 * Usage:            WeightedAdjacencyMatrix[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          EdgeWeight -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WeightedAdjacencyMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeightedAdjacencyMatrix.html
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
fun weightedAdjacencyMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeightedAdjacencyMatrix", arguments.toMutableList(), options)
}
