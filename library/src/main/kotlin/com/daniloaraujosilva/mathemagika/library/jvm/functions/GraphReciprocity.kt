package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphReciprocity
 *
 * Full name:        System`GraphReciprocity
 *
 *                   GraphReciprocity[g] gives the reciprocity of a graph g.
 * Usage:            GraphReciprocity[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          SelfLoops -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphReciprocity
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphReciprocity.html
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
fun graphReciprocity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphReciprocity", arguments.toMutableList(), options)
}
