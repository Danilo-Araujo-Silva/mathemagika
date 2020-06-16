package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HypergeometricDistribution
 *
 * Full name:        System`HypergeometricDistribution
 *
 *                   HypergeometricDistribution[n, n    , n   ] represents a hypergeometric distribution.
 * Usage:                                           succ   tot
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HypergeometricDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HypergeometricDistribution.html
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
fun hypergeometricDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HypergeometricDistribution", arguments.toMutableList(), options)
}
