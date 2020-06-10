package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WeierstrassEta3
 * 
 * Full name:        System`WeierstrassEta3
 * 
 *                   WeierstrassEta3[{g , g }] gives the value η  of the Weierstrass zeta function ζ at the half-period ω (g , g ).
 * Usage:                              2   3                    3                                                        3  2   3
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/WeierstrassEta3
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassEta3.html
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
fun weierstrassEta3(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassEta3", arguments.toMutableList(), options)
}
