package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LCM
 *
 * Full name:        System`LCM
 *
 *                   LCM[n , n , …] gives the least common multiple of the n .
 * Usage:                 1   2                                             i
 *
 * Options:          None
 *
 *                   Flat
 *                   Listable
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LCM
 * Documentation:    web: http://reference.wolfram.com/language/ref/LCM.html
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
fun lCM(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LCM", arguments.toMutableList(), options)
}
