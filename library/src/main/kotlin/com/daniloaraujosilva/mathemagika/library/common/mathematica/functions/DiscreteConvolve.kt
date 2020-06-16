package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteConvolve
 *
 * Full name:        System`DiscreteConvolve
 *
 *                   DiscreteConvolve[f, g, n, m] gives the convolution with respect to n of the expressions f and g.
 *                   DiscreteConvolve[f, g, {n , n , …}, {m , m , …}] gives the multidimensional convolution.
 * Usage:                                     1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          VerifyConvergence -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteConvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteConvolve.html
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
fun discreteConvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteConvolve", arguments.toMutableList(), options)
}
