package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AdjacencyMatrix
 *
 * Full name:        System`AdjacencyMatrix
 *
 *                   AdjacencyMatrix[g] gives the vertex–vertex adjacency matrix of the graph g.
 * Usage:            AdjacencyMatrix[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AdjacencyMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/AdjacencyMatrix.html
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
fun adjacencyMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AdjacencyMatrix", arguments.toMutableList(), options)
}
