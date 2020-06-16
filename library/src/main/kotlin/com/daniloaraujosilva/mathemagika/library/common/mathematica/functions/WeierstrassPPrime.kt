package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WeierstrassPPrime
 *
 * Full name:        System`WeierstrassPPrime
 *
 *                   WeierstrassPPrime[u, {g , g }] gives the derivative of the Weierstrass elliptic function ℘(u ; g , g ).
 * Usage:                                   2   3                                                                    2   3
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeierstrassPPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeierstrassPPrime.html
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
fun weierstrassPPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeierstrassPPrime", arguments.toMutableList(), options)
}
