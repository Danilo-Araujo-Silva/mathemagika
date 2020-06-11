package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TuttePolynomial
 *
 * Full name:        System`TuttePolynomial
 *
 *                   TuttePolynomial[g, {x, y}] gives the Tutte polynomial of the graph g.
 * Usage:            TuttePolynomial[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TuttePolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/TuttePolynomial.html
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
fun tuttePolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TuttePolynomial", arguments.toMutableList(), options)
}
