package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GroebnerBasis
 *
 * Full name:        System`GroebnerBasis
 *
 *                   GroebnerBasis[{poly , poly , …}, {x , x , …}] gives a list of polynomials that form a Gröbner basis for the set of polynomials poly .
 *                                      1      2        1   2                                                                                           i
 *                   GroebnerBasis[{poly , poly , …}, {x , x , …}, {y , y , …}] finds a Gröbner basis in which the y  have been eliminated.
 * Usage:                               1      2        1   2        1   2                                          i
 *
 *                   CoefficientDomain -> Automatic
 *                   DegreeBound -> Infinity
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   MonomialOrder -> Lexicographic
 *                   ParameterVariables -> {}
 *                   Sort -> False
 * Options:          Tolerance -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroebnerBasis
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroebnerBasis.html
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
fun groebnerBasis(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroebnerBasis", arguments.toMutableList(), options)
}
