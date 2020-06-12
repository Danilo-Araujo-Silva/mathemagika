package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KCoreComponents
 *
 * Full name:        System`KCoreComponents
 *
 *                   KCoreComponents[g, k] gives the k-core components of the underlying simple graph of g.
 *                   KCoreComponents[g, k, "In"] gives the k-core components with vertex in-degrees at least k.
 *                   KCoreComponents[g, k, "Out"] gives the k-core components with vertex out-degrees at least k.
 * Usage:            KCoreComponents[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KCoreComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/KCoreComponents.html
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
fun kCoreComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KCoreComponents", arguments.toMutableList(), options)
}
