package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WeaklyConnectedGraphQ
 *
 * Full name:        System`WeaklyConnectedGraphQ
 *
 * Usage:            WeaklyConnectedGraphQ[g] yields True if the graph g is weakly connected, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WeaklyConnectedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeaklyConnectedGraphQ.html
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
fun weaklyConnectedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeaklyConnectedGraphQ", arguments.toMutableList(), options)
}
