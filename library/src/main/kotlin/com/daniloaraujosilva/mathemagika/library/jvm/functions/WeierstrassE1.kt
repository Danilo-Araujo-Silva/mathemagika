package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassE1
 *
 * Full name:        System`WeierstrassE1
 *
 *                   WeierstrassE1[{g , g }] gives the value e  of the Weierstrass elliptic function ℘ at the half-period ω (g , g ).
 * Usage:                            2   3                    1                                                            1  2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassE1
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassE1.html
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
fun weierstrassE1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassE1", arguments.toMutableList(), options)
}
