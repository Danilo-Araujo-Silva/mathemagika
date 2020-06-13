package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassHalfPeriodW1
 *
 * Full name:        System`WeierstrassHalfPeriodW1
 *
 *                   WeierstrassHalfPeriodW1[{g , g }] gives the half-period ω  for Weierstrass elliptic functions corresponding to the invariants {g , g }.
 * Usage:                                      2   3                          1                                                                      2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassHalfPeriodW1
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassHalfPeriodW1.html
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
fun weierstrassHalfPeriodW1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassHalfPeriodW1", arguments.toMutableList(), options)
}
