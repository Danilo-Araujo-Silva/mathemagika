package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             QBinomial
 *
 * Full name:        System`QBinomial
 *
 *                   QBinomial[n, m, q] gives the q-binomial coefficient (n) .
 *                                                                          q
 * Usage:                                                                 m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QBinomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/QBinomial.html
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
fun qBinomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QBinomial", arguments.toMutableList(), options)
}
