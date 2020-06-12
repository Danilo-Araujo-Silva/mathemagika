package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OrderingBy
 *
 * Full name:        System`OrderingBy
 *
 *                   OrderingBy[list, f] gives the positions in list at which each successive element of SortBy[list, f] appears.
 *                   OrderingBy[list, f, n] gives the positions in list at which the first n elements of SortBy[list, f] appear.
 *                   OrderingBy[list, f, -n] gives the positions of the last n elements of SortBy[list, f].
 * Usage:            OrderingBy[list, f, n, p] gives positions in list of elements of SortBy[list, f, p].
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OrderingBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrderingBy.html
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
fun orderingBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrderingBy", arguments.toMutableList(), options)
}
