package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Reverse
 *
 * Full name:        System`Reverse
 *
 *                   Reverse[expr] reverses the order of the elements in expr.
 *                   Reverse[expr, n] reverses elements at level n in expr.
 *                   Reverse[expr, {n , n , …}] reverses elements at levels n , n , … in expr.
 * Usage:                            1   2                                   1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Reverse
 * Documentation:    web: http://reference.wolfram.com/language/ref/Reverse.html
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
fun reverse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Reverse", arguments.toMutableList(), options)
}
