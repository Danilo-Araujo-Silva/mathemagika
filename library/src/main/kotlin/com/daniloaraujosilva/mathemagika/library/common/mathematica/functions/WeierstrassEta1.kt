package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassEta1
 *
 * Full name:        System`WeierstrassEta1
 *
 *                   WeierstrassEta1[{g , g }] gives the value η  of the Weierstrass zeta function ζ at the half-period ω (g , g ).
 * Usage:                              2   3                    1                                                        1  2   3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassEta1
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassEta1.html
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
fun weierstrassEta1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassEta1", arguments.toMutableList(), options)
}
