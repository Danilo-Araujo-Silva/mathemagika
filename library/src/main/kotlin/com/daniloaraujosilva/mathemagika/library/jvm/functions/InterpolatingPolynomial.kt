package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InterpolatingPolynomial
 *
 * Full name:        System`InterpolatingPolynomial
 *
 *                   InterpolatingPolynomial[{f , f , …}, x] constructs an interpolating polynomial in x which reproduces the function values f  at successive integer values 1, 2, … of x.
 *                                             1   2                                                                                           i
 *                   InterpolatingPolynomial[{{x , f }, {x , f }, …}, x] constructs an interpolating polynomial for the function values f  corresponding to x values x .
 *                                              1   1     2   2                                                                          i                            i
 *                   InterpolatingPolynomial[{{{x , y , …}, f }, {{x , y , …}, f }, …}, {x, y, …}] constructs a multidimensional interpolating polynomial in the variables x, y, ….
 *                                               1   1       1      2   2       2
 *                   InterpolatingPolynomial[{{{x , …}, f , df , …}, …}, {x, …}] constructs an interpolating polynomial that reproduces derivatives as well as function values.
 * Usage:                                        1       1    1
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InterpolatingPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/InterpolatingPolynomial.html
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
fun interpolatingPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InterpolatingPolynomial", arguments.toMutableList(), options)
}
