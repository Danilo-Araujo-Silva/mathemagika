package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SortBy
 *
 * Full name:        System`SortBy
 *
 *                   SortBy[list, f] sorts the elements of list in the order defined by applying f to each of them.
 *                   SortBy[list, {f , f , …}] breaks ties by successively using the values obtained from the f .
 *                                  1   2                                                                      i
 *                   SortBy[list, f, p] sorts the elements of list using the function p to compare the results of applying f to each element.
 * Usage:            SortBy[f] represents an operator form of SortBy that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SortBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/SortBy.html
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
fun sortBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SortBy", arguments.toMutableList(), options)
}
