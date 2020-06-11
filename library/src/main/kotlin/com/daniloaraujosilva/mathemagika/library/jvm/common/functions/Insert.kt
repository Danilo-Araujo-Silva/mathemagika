package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Insert
 *
 * Full name:        System`Insert
 *
 *                   Insert[list, elem, n] inserts elem at position n in list. If n is negative, the position is counted from the end.
 *                   Insert[expr, elem, {i, j, …}] inserts elem at position {i, j, …} in expr.
 *                   Insert[expr, elem, {{i , j , …}, {i , j , …}, …}] inserts elem at several positions.
 *                                         1   1        2   2
 * Usage:            Insert[elem, pos] represents an operator form of Insert that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Insert
 * Documentation:    web: http://reference.wolfram.com/language/ref/Insert.html
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
fun insert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Insert", arguments.toMutableList(), options)
}
