package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MinimalPolynomial
 *
 * Full name:        System`MinimalPolynomial
 *
 * Usage:            MinimalPolynomial[s, x] gives the minimal polynomial in x for which the algebraic number s is a root.
 *
 * Options:          Extension -> None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MinimalPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinimalPolynomial.html
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
fun minimalPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinimalPolynomial", arguments.toMutableList(), options)
}
