package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectedGraphQ
 *
 * Full name:        System`ConnectedGraphQ
 *
 * Usage:            ConnectedGraphQ[g] yields True if the graph g is connected, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConnectedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectedGraphQ.html
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
fun connectedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectedGraphQ", arguments.toMutableList(), options)
}
