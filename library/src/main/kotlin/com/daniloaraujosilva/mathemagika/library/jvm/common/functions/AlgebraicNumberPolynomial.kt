package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlgebraicNumberPolynomial
 *
 * Full name:        System`AlgebraicNumberPolynomial
 *
 * Usage:            AlgebraicNumberPolynomial[a, x] gives the polynomial in x corresponding to the AlgebraicNumber object a.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AlgebraicNumberPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicNumberPolynomial.html
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
fun algebraicNumberPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicNumberPolynomial", arguments.toMutableList(), options)
}
