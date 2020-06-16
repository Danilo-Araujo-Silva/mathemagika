package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassE3
 *
 * Full name:        System`WeierstrassE3
 *
 *                   WeierstrassE3[{g , g }] gives the value e  of the Weierstrass elliptic function ℘ at the half-period ω (g , g ).
 * Usage:                            2   3                    3                                                            3  2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassE3
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassE3.html
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
fun weierstrassE3(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassE3", arguments.toMutableList(), options)
}
