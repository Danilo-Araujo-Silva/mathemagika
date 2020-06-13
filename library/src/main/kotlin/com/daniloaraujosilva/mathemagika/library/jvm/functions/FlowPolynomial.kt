package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FlowPolynomial
 *
 * Full name:        System`FlowPolynomial
 *
 *                   FlowPolynomial[g, k] gives the flow polynomial of the graph g.
 * Usage:            FlowPolynomial[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FlowPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/FlowPolynomial.html
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
fun flowPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FlowPolynomial", arguments.toMutableList(), options)
}
