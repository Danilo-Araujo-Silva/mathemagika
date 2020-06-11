package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassEta2
 *
 * Full name:        System`WeierstrassEta2
 *
 *                   WeierstrassEta2[{g , g }] gives the value η  of the Weierstrass zeta function ζ at the half-period ω (g , g ).
 * Usage:                              2   3                    2                                                        2  2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassEta2
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassEta2.html
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
fun weierstrassEta2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassEta2", arguments.toMutableList(), options)
}
