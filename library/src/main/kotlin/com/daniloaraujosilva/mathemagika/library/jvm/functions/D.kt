package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             D
 *
 * Full name:        System`D
 *
 *                   D[f, x] gives the partial derivative ∂ f/∂ x.
 *                                                               n      n
 *                   D[f, {x, n}] gives the multiple derivative ∂  f/∂ x .
 *                   D[f, x, y, …] gives the partial derivative ⋯ (∂/∂ y) (∂/∂ x)  f.
 *                                                                                     m    m    n    n
 *                   D[f, {x, n}, {y, m}, …] gives the multiple partial derivative ⋯ (∂ /∂ y ) (∂ /∂ x )  f.
 *                   D[f, {{x , x , …}}] for a scalar f gives the vector derivative (∂ f/∂ x , ∂ f/∂ x , …).
 *                           1   2                                                          1         2
 * Usage:            D[f, {array}] gives an array derivative.
 *
 * Options:          NonConstants -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/D
 * Documentation:    web: http://reference.wolfram.com/language/ref/D.html
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
fun d(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("D", arguments.toMutableList(), options)
}
