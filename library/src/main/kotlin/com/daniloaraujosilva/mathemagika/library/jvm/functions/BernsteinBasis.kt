package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BernsteinBasis
 *
 * Full name:        System`BernsteinBasis
 *
 *                                                            th
 * Usage:            BernsteinBasis[d, n, x] represents the n   Bernstein basis function of degree d at x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldAll
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BernsteinBasis
 * Documentation:    web: http://reference.wolfram.com/language/ref/BernsteinBasis.html
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
fun bernsteinBasis(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BernsteinBasis", arguments.toMutableList(), options)
}
