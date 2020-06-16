package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubresultantPolynomialRemainders
 *
 * Full name:        System`SubresultantPolynomialRemainders
 *
 *                   SubresultantPolynomialRemainders[poly , poly , var] gives the subresultant polynomial remainder sequence of the polynomials poly  and poly  with respect to the variable var.
 *                                                        1      2                                                                                   1         2
 *                   SubresultantPolynomialRemainders[poly , poly , var, Modulus  p] computes the subresultant polynomial remainder sequence modulo the prime p.
 * Usage:                                                 1      2
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SubresultantPolynomialRemainders
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubresultantPolynomialRemainders.html
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
fun subresultantPolynomialRemainders(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubresultantPolynomialRemainders", arguments.toMutableList(), options)
}
