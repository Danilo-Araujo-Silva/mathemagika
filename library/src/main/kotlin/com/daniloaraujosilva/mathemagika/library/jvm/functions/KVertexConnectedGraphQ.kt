package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KVertexConnectedGraphQ
 *
 * Full name:        System`KVertexConnectedGraphQ
 *
 * Usage:            KVertexConnectedGraphQ[g, k] yields True if the graph g is k-vertex-connected and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KVertexConnectedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KVertexConnectedGraphQ.html
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
fun kVertexConnectedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KVertexConnectedGraphQ", arguments.toMutableList(), options)
}
