package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PolynomialQuotientRemainder
 *
 * Full name:        System`PolynomialQuotientRemainder
 *
 * Usage:            PolynomialQuotientRemainder[p, q, x] gives a list of the quotient and remainder of p and q, treated as polynomials in x.
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PolynomialQuotientRemainder
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialQuotientRemainder.html
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
fun polynomialQuotientRemainder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialQuotientRemainder", arguments.toMutableList(), options)
}
