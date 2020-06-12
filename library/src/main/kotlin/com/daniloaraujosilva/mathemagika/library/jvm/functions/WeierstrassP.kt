package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassP
 *
 * Full name:        System`WeierstrassP
 *
 *                   WeierstrassP[u, {g , g }] gives the Weierstrass elliptic function ℘(u ; g , g ).
 * Usage:                              2   3                                                  2   3
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassP
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassP.html
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
fun weierstrassP(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassP", arguments.toMutableList(), options)
}
