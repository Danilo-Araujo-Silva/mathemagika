package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassHalfPeriodW2
 *
 * Full name:        System`WeierstrassHalfPeriodW2
 *
 *                   WeierstrassHalfPeriodW2[{g , g }] gives the half-period ω  for the Weierstrass elliptic functions corresponding to the invariants {g , g }.
 * Usage:                                      2   3                          2                                                                          2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassHalfPeriodW2
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassHalfPeriodW2.html
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
fun weierstrassHalfPeriodW2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassHalfPeriodW2", arguments.toMutableList(), options)
}
