package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphPeriphery
 *
 * Full name:        System`GraphPeriphery
 *
 *                   GraphPeriphery[g] gives vertices that are maximally distant to at least one vertex in the graph g.
 * Usage:            GraphPeriphery[{v  w, …}] uses rules v  w to specify the graph g.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphPeriphery
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphPeriphery.html
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
fun graphPeriphery(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphPeriphery", arguments.toMutableList(), options)
}
