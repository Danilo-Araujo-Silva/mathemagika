package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BitClear
 *
 * Full name:        System`BitClear
 *
 *                                                                                         k
 * Usage:            BitClear[n, k] sets to 0 the bit corresponding to the coefficient of 2  in the integer n.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BitClear
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitClear.html
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
fun bitClear(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitClear", arguments.toMutableList(), options)
}
