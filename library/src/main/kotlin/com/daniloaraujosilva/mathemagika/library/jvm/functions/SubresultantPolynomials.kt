package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SubresultantPolynomials
 *
 * Full name:        System`SubresultantPolynomials
 *
 *                   SubresultantPolynomials[poly , poly , var] generates a list of subresultant polynomials of the polynomials poly  and poly  with respect to the variable var.
 *                                               1      2                                                                           1         2
 *                   SubresultantPolynomials[poly , poly , var, Modulus  p] computes the subresultant polynomials modulo the prime p.
 * Usage:                                        1      2
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SubresultantPolynomials
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubresultantPolynomials.html
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
fun subresultantPolynomials(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubresultantPolynomials", arguments.toMutableList(), options)
}
