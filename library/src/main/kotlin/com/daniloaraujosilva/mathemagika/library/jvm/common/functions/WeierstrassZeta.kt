package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassZeta
 *
 * Full name:        System`WeierstrassZeta
 *
 *                   WeierstrassZeta[u, {g , g }] gives the Weierstrass zeta function ζ(u ; g , g ).
 * Usage:                                 2   3                                              2   3
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassZeta
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassZeta.html
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
fun weierstrassZeta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassZeta", arguments.toMutableList(), options)
}
