package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseWeierstrassP
 *
 * Full name:        System`InverseWeierstrassP
 *
 *                   InverseWeierstrassP[p, {g , g }] gives a value of u for which the Weierstrass function ℘ (u ; g , g ) is equal to p.
 * Usage:                                     2   3                                                                 2   3
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseWeierstrassP
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseWeierstrassP.html
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
fun inverseWeierstrassP(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseWeierstrassP", arguments.toMutableList(), options)
}
