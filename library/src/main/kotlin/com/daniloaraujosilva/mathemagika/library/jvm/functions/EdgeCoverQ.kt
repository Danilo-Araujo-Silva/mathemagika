package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeCoverQ
 *
 * Full name:        System`EdgeCoverQ
 *
 * Usage:            EdgeCoverQ[g, elist] yields True if the edge list elist is an edge cover of the graph g and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EdgeCoverQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeCoverQ.html
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
fun edgeCoverQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeCoverQ", arguments.toMutableList(), options)
}
