package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeCount
 *
 * Full name:        System`EdgeCount
 *
 *                   EdgeCount[g] gives a count of the number of edges in the graph g.
 *                   EdgeCount[g, patt] gives a count of the number of edges that match the pattern patt.
 * Usage:            EdgeCount[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeCount.html
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
fun edgeCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeCount", arguments.toMutableList(), options)
}
