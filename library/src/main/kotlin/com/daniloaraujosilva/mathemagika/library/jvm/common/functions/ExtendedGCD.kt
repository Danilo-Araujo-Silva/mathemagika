package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExtendedGCD
 *
 * Full name:        System`ExtendedGCD
 *
 *                   ExtendedGCD[n , n , …] gives the extended greatest common divisor of the integers n .
 * Usage:                         1   2                                                                 i
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExtendedGCD
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtendedGCD.html
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
fun extendedGCD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtendedGCD", arguments.toMutableList(), options)
}
