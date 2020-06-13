package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ChromaticPolynomial
 *
 * Full name:        System`ChromaticPolynomial
 *
 *                   ChromaticPolynomial[g, k] gives the chromatic polynomial of the graph g.
 * Usage:            ChromaticPolynomial[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ChromaticPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChromaticPolynomial.html
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
fun chromaticPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChromaticPolynomial", arguments.toMutableList(), options)
}
