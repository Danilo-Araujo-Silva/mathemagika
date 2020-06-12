package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Part
 *
 * Full name:        System`Part
 *
 *                                                          th
 *                   expr[[i]] or Part[expr, i] gives the i   part of expr.
 *                   expr[[-i]] counts from the end.
 *                   expr[[i, j, …]] or Part[expr, i, j, …] is equivalent to expr[[i]][[j]] ….
 *                   expr[[{i , i , …}]] gives a list of the parts i , i , … of expr.
 *                           1   2                                  1   2
 *                   expr[[m;;n]] gives parts m through n.
 *                   expr[[m;;n;;s]] gives parts m through n in steps of s.
 *                   expr[["key"]] gives the value associated with the key "key" in an association expr.
 * Usage:            expr[[Key[k]]] gives the value associated with an arbitrary key k in the association expr.
 *
 * Options:          None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Part
 * Documentation:    web: http://reference.wolfram.com/language/ref/Part.html
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
fun part(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Part", arguments.toMutableList(), options)
}
