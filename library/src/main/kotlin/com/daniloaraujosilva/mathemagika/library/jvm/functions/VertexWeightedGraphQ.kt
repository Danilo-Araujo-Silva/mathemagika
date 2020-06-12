package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VertexWeightedGraphQ
 *
 * Full name:        System`VertexWeightedGraphQ
 *
 * Usage:            VertexWeightedGraphQ[g] yields True if the graph g is a vertex-weighted graph, and False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexWeightedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexWeightedGraphQ.html
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
fun vertexWeightedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexWeightedGraphQ", arguments.toMutableList(), options)
}
