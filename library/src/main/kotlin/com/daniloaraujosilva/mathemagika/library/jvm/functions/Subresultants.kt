package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Subresultants
 *
 * Full name:        System`Subresultants
 *
 *                   Subresultants[poly , poly , var] generates a list of the principal subresultant coefficients of the polynomials poly  and poly  with respect to the variable var.
 *                                     1      2                                                                                          1         2
 *                   Subresultants[poly , poly , var, Modulus  p] computes the principal subresultant coefficients modulo the prime p.
 * Usage:                              1      2
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Subresultants
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subresultants.html
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
fun subresultants(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subresultants", arguments.toMutableList(), options)
}
