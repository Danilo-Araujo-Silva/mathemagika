package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DirichletConvolve
 *
 * Full name:        System`DirichletConvolve
 *
 * Usage:            DirichletConvolve[f, g, n, m] gives the Dirichlet convolution of the expressions f and g.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DirichletConvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletConvolve.html
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
fun dirichletConvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletConvolve", arguments.toMutableList(), options)
}
