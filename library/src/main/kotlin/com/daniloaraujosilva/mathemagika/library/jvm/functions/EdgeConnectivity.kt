package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeConnectivity
 *
 * Full name:        System`EdgeConnectivity
 *
 *                   EdgeConnectivity[g] gives the edge connectivity of the graph g.
 *                   EdgeConnectivity[g, s, t] gives the s-t edge connectivity of the graph g.
 * Usage:            EdgeConnectivity[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          EdgeWeight -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EdgeConnectivity
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeConnectivity.html
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
fun edgeConnectivity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeConnectivity", arguments.toMutableList(), options)
}
