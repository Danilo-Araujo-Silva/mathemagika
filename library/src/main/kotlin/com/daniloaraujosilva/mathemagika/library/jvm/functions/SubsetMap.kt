package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SubsetMap
 *
 * Full name:        System`SubsetMap
 *
 *                   SubsetMap[f, {e , e , …}, {i, j, …}] yields an expression in which the elements e , e , … in the list {e , e , …} are replaced with the corresponding elements of the list obtained by evaluating f[{e , e , …}].
 *                                  1   2                                                             i   j                  1   2                                                                                         i   j
 *                   SubsetMap[f, expr, {pos , pos , …}] replaces elements of expr at positions pos , pos , ….
 *                                          1     2                                                1     2
 *                   SubsetMap[f, {pos , pos , …}] represents an operator form of SubsetMap that can be applied to an expression.
 * Usage:                             1     2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsetMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetMap.html
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
fun subsetMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetMap", arguments.toMutableList(), options)
}
