package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassInvariantG3
 *
 * Full name:        System`WeierstrassInvariantG3
 *
 *                                               ′                                                                                                       ′
 *                   WeierstrassInvariantG3[{ω, ω ] gives the invariant g  for the Weierstrass elliptic functions corresponding to the half‐periods {ω, ω }.
 * Usage:                                                                3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassInvariantG3
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassInvariantG3.html
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
fun weierstrassInvariantG3(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassInvariantG3", arguments.toMutableList(), options)
}
