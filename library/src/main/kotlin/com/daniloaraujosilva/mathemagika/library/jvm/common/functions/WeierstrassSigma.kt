package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassSigma
 *
 * Full name:        System`WeierstrassSigma
 *
 *                   WeierstrassSigma[u, {g , g }] gives the Weierstrass sigma function σ(u ; g , g ).
 * Usage:                                  2   3                                               2   3
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassSigma
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassSigma.html
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
fun weierstrassSigma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassSigma", arguments.toMutableList(), options)
}
