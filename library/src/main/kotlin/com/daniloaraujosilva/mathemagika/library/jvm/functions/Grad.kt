package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Grad
 *
 * Full name:        System`Grad
 *
 *                   Grad[f, {x , …, x }] gives the gradient (∂ f/∂ x , …, ∂ f/∂ x ).
 *                             1      n                              1            n
 *                   Grad[f, {x , …, x }, chart] gives the gradient in the coordinates chart.
 * Usage:                      1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Grad
 * Documentation:    web: http://reference.wolfram.com/language/ref/Grad.html
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
fun grad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Grad", arguments.toMutableList(), options)
}
