package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KEdgeConnectedGraphQ
 *
 * Full name:        System`KEdgeConnectedGraphQ
 *
 * Usage:            KEdgeConnectedGraphQ[g, k] yields True if the graph g is k-edge-connected and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KEdgeConnectedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/KEdgeConnectedGraphQ.html
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
fun kEdgeConnectedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KEdgeConnectedGraphQ", arguments.toMutableList(), options)
}
