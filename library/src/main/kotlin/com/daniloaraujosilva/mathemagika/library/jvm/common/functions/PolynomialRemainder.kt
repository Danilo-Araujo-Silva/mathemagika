package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolynomialRemainder
 *
 * Full name:        System`PolynomialRemainder
 *
 * Usage:            PolynomialRemainder[p, q, x] gives the remainder from dividing p by q, treated as polynomials in x.
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PolynomialRemainder
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialRemainder.html
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
fun polynomialRemainder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialRemainder", arguments.toMutableList(), options)
}
