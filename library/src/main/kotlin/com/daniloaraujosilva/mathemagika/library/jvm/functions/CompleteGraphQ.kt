package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompleteGraphQ
 *
 * Full name:        System`CompleteGraphQ
 *
 *                   CompleteGraphQ[g] yields True if the graph g is a complete graph, and False otherwise.
 * Usage:            CompleteGraphQ[g, vlist] yields True if the subgraph induced by vlist is a complete graph, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CompleteGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompleteGraphQ.html
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
fun completeGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompleteGraphQ", arguments.toMutableList(), options)
}
