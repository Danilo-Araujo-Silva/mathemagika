package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BitXor
 *
 * Full name:        System`BitXor
 *
 *                   BitXor[n , n , …] gives the bitwise XOR of the integers n .
 * Usage:                    1   2                                            i
 *
 * Options:          None
 *
 *                   Flat
 *                   Listable
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BitXor
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitXor.html
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
fun bitXor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitXor", arguments.toMutableList(), options)
}
