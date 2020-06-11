package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WalleniusHypergeometricDistribution
 *
 * Full name:        System`WalleniusHypergeometricDistribution
 *
 *                   WalleniusHypergeometricDistribution[n, n    , n   , w] represents a Wallenius noncentral hypergeometric distribution.
 * Usage:                                                    succ   tot
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WalleniusHypergeometricDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WalleniusHypergeometricDistribution.html
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
fun walleniusHypergeometricDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WalleniusHypergeometricDistribution", arguments.toMutableList(), options)
}
