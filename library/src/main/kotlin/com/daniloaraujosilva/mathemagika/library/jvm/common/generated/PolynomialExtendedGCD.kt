package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolynomialExtendedGCD
 * 
 * Full name:        System`PolynomialExtendedGCD
 * 
 *                   PolynomialExtendedGCD[poly , poly , x] gives the extended GCD of poly  and poly  treated as univariate polynomials in x.
 *                                             1      2                                   1         2
 *                   PolynomialExtendedGCD[poly , poly , x, Modulus  p] gives the extended GCD over the integers mod prime p.
 * Usage:                                      1      2
 * 
 *                   Method -> Automatic
 * Options:          Modulus -> 0
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PolynomialExtendedGCD
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialExtendedGCD.html
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
fun polynomialExtendedGCD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialExtendedGCD", arguments.toMutableList(), options)
}
