package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassInvariants
 *
 * Full name:        System`WeierstrassInvariants
 *
 *                   WeierstrassInvariants[{ω , ω }] gives the invariants {g , g } for Weierstrass elliptic functions corresponding to the half‐periods {ω , ω }.
 * Usage:                                    1   3                          2   3                                                                         1   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassInvariants
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassInvariants.html
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
fun weierstrassInvariants(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassInvariants", arguments.toMutableList(), options)
}
