package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GCD
 *
 * Full name:        System`GCD
 *
 *                   GCD[n , n , …] gives the greatest common divisor of the n .
 * Usage:                 1   2                                               i
 *
 * Options:          None
 *
 *                   Flat
 *                   Listable
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GCD
 * Documentation:    web: http://reference.wolfram.com/language/ref/GCD.html
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
fun gCD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GCD", arguments.toMutableList(), options)
}
