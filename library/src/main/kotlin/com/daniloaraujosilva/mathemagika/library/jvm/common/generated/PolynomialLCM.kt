package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolynomialLCM
 * 
 * Full name:        System`PolynomialLCM
 * 
 *                   PolynomialLCM[poly , poly , …] gives the least common multiple of the polynomials poly . 
 *                                     1      2                                                            i
 *                   PolynomialLCM[poly , poly , …, Modulus  p] evaluates the LCM modulo the prime p. 
 * Usage:                              1      2
 * 
 *                   Extension -> None
 *                   Modulus -> 0
 * Options:          Trig -> False
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PolynomialLCM
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialLCM.html
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
fun polynomialLCM(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialLCM", arguments.toMutableList(), options)
}
