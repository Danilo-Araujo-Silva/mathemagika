package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeWeightedGraphQ
 *
 * Full name:        System`EdgeWeightedGraphQ
 *
 * Usage:            EdgeWeightedGraphQ[g] yields True if the graph g is an edge-weighted graph and False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeWeightedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeWeightedGraphQ.html
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
fun edgeWeightedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeWeightedGraphQ", arguments.toMutableList(), options)
}
