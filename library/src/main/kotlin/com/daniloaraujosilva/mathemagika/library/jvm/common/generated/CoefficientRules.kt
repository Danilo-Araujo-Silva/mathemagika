package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CoefficientRules
 * 
 * Full name:        System`CoefficientRules
 * 
 *                   CoefficientRules[poly, {x , x , …}] gives the list {{e  , e  , …}  c , {e  , …}  c , …} of exponent vectors and coefficients for the monomials in poly with respect to the x .
 *                                            1   2                        11   12        1    21        2                                                                                         i
 *                   CoefficientRules[poly, {x , x , …}, order] gives the result with the monomial ordering specified by order.
 * Usage:                                     1   2
 * 
 * Options:          Modulus -> 0
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CoefficientRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoefficientRules.html
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
fun coefficientRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoefficientRules", arguments.toMutableList(), options)
}
