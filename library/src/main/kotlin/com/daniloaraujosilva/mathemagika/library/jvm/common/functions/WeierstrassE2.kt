package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassE2
 *
 * Full name:        System`WeierstrassE2
 *
 *                   WeierstrassE2[{g , g }] gives the value e  of the Weierstrass elliptic function ℘ at the half-period ω (g , g ).
 * Usage:                            2   3                    2                                                            2  2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassE2
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassE2.html
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
fun weierstrassE2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassE2", arguments.toMutableList(), options)
}
