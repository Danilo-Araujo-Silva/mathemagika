package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GraphCenter
 *
 * Full name:        System`GraphCenter
 *
 *                   GraphCenter[g] gives the set of vertices with minimum eccentricity in the graph g.
 * Usage:            GraphCenter[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphCenter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphCenter.html
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
fun graphCenter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphCenter", arguments.toMutableList(), options)
}
