package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassInvariantG2
 *
 * Full name:        System`WeierstrassInvariantG2
 *
 *                                               ′                                                                                                        ′
 *                   WeierstrassInvariantG2[{ω, ω }] gives the invariant g  for the Weierstrass elliptic functions corresponding to the half‐periods {ω, ω }.
 * Usage:                                                                 2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassInvariantG2
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassInvariantG2.html
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
fun weierstrassInvariantG2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassInvariantG2", arguments.toMutableList(), options)
}
