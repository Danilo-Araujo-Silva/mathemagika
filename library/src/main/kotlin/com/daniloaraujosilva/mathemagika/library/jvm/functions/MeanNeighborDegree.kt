package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanNeighborDegree
 *
 * Full name:        System`MeanNeighborDegree
 *
 *                   MeanNeighborDegree[g] gives a list of mean neighbor degrees of vertices for the graph g.
 *                   MeanNeighborDegree[g, "In"] gives a list of mean neighbor in-degrees.
 *                   MeanNeighborDegree[g, "Out"] gives a list of mean neighbor out-degrees.
 * Usage:            MeanNeighborDegree[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeanNeighborDegree
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanNeighborDegree.html
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
fun meanNeighborDegree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanNeighborDegree", arguments.toMutableList(), options)
}
