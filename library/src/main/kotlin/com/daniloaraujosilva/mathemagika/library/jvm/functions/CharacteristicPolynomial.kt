package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CharacteristicPolynomial
 *
 * Full name:        System`CharacteristicPolynomial
 *
 *                   CharacteristicPolynomial[m, x] gives the characteristic polynomial for the matrix m.
 * Usage:            CharacteristicPolynomial[{m, a}, x] gives the generalized characteristic polynomial with respect to a.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CharacteristicPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacteristicPolynomial.html
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
fun characteristicPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacteristicPolynomial", arguments.toMutableList(), options)
}
