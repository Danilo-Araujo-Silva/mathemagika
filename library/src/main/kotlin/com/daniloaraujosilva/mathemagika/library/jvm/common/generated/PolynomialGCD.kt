package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolynomialGCD
 * 
 * Full name:        System`PolynomialGCD
 * 
 *                   PolynomialGCD[poly , poly , …] gives the greatest common divisor of the polynomials poly . 
 *                                     1      2                                                              i
 *                   PolynomialGCD[poly , poly , …, Modulus  p] evaluates the GCD modulo the prime p. 
 * Usage:                              1      2
 * 
 *                   Extension -> None
 *                   Modulus -> 0
 * Options:          Trig -> False
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PolynomialGCD
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialGCD.html
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
fun polynomialGCD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialGCD", arguments.toMutableList(), options)
}
