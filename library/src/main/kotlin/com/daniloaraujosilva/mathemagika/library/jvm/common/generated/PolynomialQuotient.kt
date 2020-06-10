package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PolynomialQuotient
 * 
 * Full name:        System`PolynomialQuotient
 * 
 * Usage:            PolynomialQuotient[p, q, x] gives the quotient of p and q, treated as polynomials in x, with any remainder dropped. 
 * 
 * Options:          Modulus -> 0
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PolynomialQuotient
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialQuotient.html
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
fun polynomialQuotient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialQuotient", arguments.toMutableList(), options)
}
