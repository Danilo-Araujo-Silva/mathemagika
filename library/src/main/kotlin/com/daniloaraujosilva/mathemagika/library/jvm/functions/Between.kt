package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Between
 *
 * Full name:        System`Between
 *
 *                   Between[x, {min, max}] is equivalent to min ≤ x ≤ max.
 *                   Between[x, {{min , max }, {min , max }, …}] is equivalent to min  ≤ x ≤ max  || min  ≤ x ≤ max  || ….
 *                                   1     1       2     2                           1          1       2          2
 * Usage:            Between[range] is an operator form that yields Between[x, range] when applied to an expression x.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Between
 * Documentation:    web: http://reference.wolfram.com/language/ref/Between.html
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
fun between(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Between", arguments.toMutableList(), options)
}
