package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolynomialQ
 * 
 * Full name:        System`PolynomialQ
 * 
 *                   PolynomialQ[expr, var] yields True if expr is a polynomial in var, and yields False otherwise. 
 *                   PolynomialQ[expr, {var , …}] tests whether expr is a polynomial in the var . 
 * Usage:                                  1                                                   i
 * 
 * Options:
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PolynomialQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialQ.html
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
fun polynomialQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialQ", arguments.toMutableList(), options)
}
