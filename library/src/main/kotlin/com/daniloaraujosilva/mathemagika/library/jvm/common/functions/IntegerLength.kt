package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntegerLength
 *
 * Full name:        System`IntegerLength
 *
 *                   IntegerLength[n] gives the number of digits in the base 10 representation of the integer n.
 * Usage:            IntegerLength[n, b] gives the number of digits in the base b representation of n.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntegerLength
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerLength.html
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
fun integerLength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerLength", arguments.toMutableList(), options)
}
