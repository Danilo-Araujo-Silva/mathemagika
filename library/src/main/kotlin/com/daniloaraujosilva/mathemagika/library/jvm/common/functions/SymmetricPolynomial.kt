package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SymmetricPolynomial
 *
 * Full name:        System`SymmetricPolynomial
 *
 *                                                                   th
 *                   SymmetricPolynomial[k, {x , …, x }] gives the k   elementary symmetric polynomial in the variables x , …, x .
 * Usage:                                     1      n                                                                    1      n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SymmetricPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetricPolynomial.html
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
fun symmetricPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetricPolynomial", arguments.toMutableList(), options)
}
