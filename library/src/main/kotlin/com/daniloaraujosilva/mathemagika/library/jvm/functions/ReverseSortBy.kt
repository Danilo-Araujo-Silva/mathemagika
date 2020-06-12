package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReverseSortBy
 *
 * Full name:        System`ReverseSortBy
 *
 *                   ReverseSortBy[list, f] sorts the elements of list using the reverse canonical order defined by applying f to each of them.
 *                   ReverseSortBy[list, f, p] sorts the elements of list using the function p to compare pairs of results of applying f to each element.
 * Usage:            ReverseSortBy[f] represents an operator form of ReverseSortBy that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReverseSortBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReverseSortBy.html
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
fun reverseSortBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReverseSortBy", arguments.toMutableList(), options)
}
