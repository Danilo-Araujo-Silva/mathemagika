package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Delete
 *
 * Full name:        System`Delete
 *
 *                   Delete[expr, n] deletes the element at position n in expr. If n is negative, the position is counted from the end.
 *                   Delete[expr, {i, j, …}] deletes the part at position {i, j, …}.
 *                   Delete[expr, {{i , j , …}, {i , j , …}, …}] deletes parts at several positions.
 *                                   1   1        2   2
 * Usage:            Delete[pos] represents an operator form of Delete that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Delete
 * Documentation:    web: http://reference.wolfram.com/language/ref/Delete.html
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
fun delete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Delete", arguments.toMutableList(), options)
}
