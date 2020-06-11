package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IndependentVertexSetQ
 *
 * Full name:        System`IndependentVertexSetQ
 *
 * Usage:            IndependentVertexSetQ[g, vlist] yields True if the vertex list vlist is an independent vertex set in the graph g, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IndependentVertexSetQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndependentVertexSetQ.html
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
fun independentVertexSetQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndependentVertexSetQ", arguments.toMutableList(), options)
}
