package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PowerSymmetricPolynomial
 * 
 * Full name:        System`PowerSymmetricPolynomial
 * 
 *                   PowerSymmetricPolynomial[r] represents a formal power symmetric polynomial with exponent r.
 *                   PowerSymmetricPolynomial[{r , r , …}] represents a multivariate formal power symmetric polynomial with exponents r , r , ….
 *                                              1   2                                                                                  1   2
 * Usage:            PowerSymmetricPolynomial[rspec, data] gives the power symmetric polynomial in data. 
 * 
 * Options:          None
 * 
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PowerSymmetricPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowerSymmetricPolynomial.html
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
fun powerSymmetricPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowerSymmetricPolynomial", arguments.toMutableList(), options)
}
