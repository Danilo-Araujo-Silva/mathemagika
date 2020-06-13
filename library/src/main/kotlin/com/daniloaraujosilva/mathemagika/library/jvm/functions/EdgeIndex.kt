package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeIndex
 *
 * Full name:        System`EdgeIndex
 *
 *                   EdgeIndex[g, e] gives the integer index for the edge e in the graph g.
 * Usage:            EdgeIndex[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeIndex.html
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
fun edgeIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeIndex", arguments.toMutableList(), options)
}
