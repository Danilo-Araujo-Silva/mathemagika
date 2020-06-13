package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BitAnd
 *
 * Full name:        System`BitAnd
 *
 *                   BitAnd[n , n , …] gives the bitwise AND of the integers n .
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
 *                   local: paclet:ref/BitAnd
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitAnd.html
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
fun bitAnd(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitAnd", arguments.toMutableList(), options)
}
