package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PolynomialMod
 *
 * Full name:        System`PolynomialMod
 *
 *                   PolynomialMod[poly, m] gives the polynomial poly reduced modulo m.
 *                   PolynomialMod[poly, {m , m , …}] reduces modulo all of the m .
 * Usage:                                  1   2                                 i
 *
 *                   CoefficientDomain -> Rationals
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PolynomialMod
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialMod.html
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
fun polynomialMod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialMod", arguments.toMutableList(), options)
}
