package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassHalfPeriodW3
 *
 * Full name:        System`WeierstrassHalfPeriodW3
 *
 *                   WeierstrassHalfPeriodW3[{g , g }] gives the half-period ω  for the Weierstrass elliptic functions corresponding to the invariants {g , g }.
 * Usage:                                      2   3                          3                                                                          2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassHalfPeriodW3
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassHalfPeriodW3.html
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
fun weierstrassHalfPeriodW3(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassHalfPeriodW3", arguments.toMutableList(), options)
}
