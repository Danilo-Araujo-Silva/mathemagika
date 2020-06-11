package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolynomialReduce
 *
 * Full name:        System`PolynomialReduce
 *
 *                   PolynomialReduce[poly, {poly , poly , …}, {x , x , …}] yields a list representing a reduction of poly in terms of the poly . The list has the form {{a , a , …}, b}, where b is minimal and a  poly  + a  poly  + … + b is exactly poly.
 * Usage:                                        1      2        1   2                                                                         i                           1   2                                  1     1    2     2
 *
 *                   CoefficientDomain -> RationalFunctions
 *                   Modulus -> 0
 *                   MonomialOrder -> Lexicographic
 *                   ParameterVariables -> {}
 * Options:          Tolerance -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolynomialReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolynomialReduce.html
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
fun polynomialReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolynomialReduce", arguments.toMutableList(), options)
}
