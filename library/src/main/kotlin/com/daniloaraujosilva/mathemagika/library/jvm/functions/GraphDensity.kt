package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphDensity
 *
 * Full name:        System`GraphDensity
 *
 *                   GraphDensity[g] gives the graph density of the graph g.
 * Usage:            GraphDensity[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          SelfLoops -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphDensity
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphDensity.html
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
fun graphDensity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphDensity", arguments.toMutableList(), options)
}
