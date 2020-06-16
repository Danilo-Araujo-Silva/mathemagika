package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GraphHub
 *
 * Full name:        System`GraphHub
 *
 *                   GraphHub[g] gives the set of vertices with maximum vertex degree in the underlying simple graph of g.
 *                   GraphHub[g, "In"] gives the set of vertices with maximum vertex in-degree.
 *                   GraphHub[g, "Out"] gives the set of vertices with maximum vertex out-degree.
 * Usage:            GraphHub[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphHub
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphHub.html
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
fun graphHub(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphHub", arguments.toMutableList(), options)
}
