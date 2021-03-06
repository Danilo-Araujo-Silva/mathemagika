package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassHalfPeriods
 *
 * Full name:        System`WeierstrassHalfPeriods
 *
 *                   WeierstrassHalfPeriods[{g , g }] gives the half‐periods {ω , ω } for Weierstrass elliptic functions corresponding to the invariants {g , g }.
 * Usage:                                     2   3                            1   3                                                                       2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassHalfPeriods
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassHalfPeriods.html
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
fun weierstrassHalfPeriods(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassHalfPeriods", arguments.toMutableList(), options)
}
