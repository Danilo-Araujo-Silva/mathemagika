package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UndirectedGraphQ
 *
 * Full name:        System`UndirectedGraphQ
 *
 * Usage:            UndirectedGraphQ[g] yields True if the graph g is an undirected graph and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UndirectedGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/UndirectedGraphQ.html
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
fun undirectedGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UndirectedGraphQ", arguments.toMutableList(), options)
}
