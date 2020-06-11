package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BitOr
 *
 * Full name:        System`BitOr
 *
 *                   BitOr[n , n , …] gives the bitwise OR of the integers n .
 * Usage:                   1   2                                           i
 *
 * Options:          None
 *
 *                   Flat
 *                   Listable
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BitOr
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitOr.html
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
fun bitOr(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitOr", arguments.toMutableList(), options)
}
