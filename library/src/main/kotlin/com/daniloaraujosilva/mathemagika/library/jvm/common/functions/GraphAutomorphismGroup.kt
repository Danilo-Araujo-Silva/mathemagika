package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphAutomorphismGroup
 *
 * Full name:        System`GraphAutomorphismGroup
 *
 *                   GraphAutomorphismGroup[g] gives the automorphism group of a graph g.
 * Usage:            GraphAutomorphismGroup[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphAutomorphismGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphAutomorphismGroup.html
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
fun graphAutomorphismGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphAutomorphismGroup", arguments.toMutableList(), options)
}
