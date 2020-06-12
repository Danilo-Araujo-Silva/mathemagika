package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FisherHypergeometricDistribution
 *
 * Full name:        System`FisherHypergeometricDistribution
 *
 *                   FisherHypergeometricDistribution[n, n    , n   , w] represents a Fisher noncentral hypergeometric distribution.
 * Usage:                                                 succ   tot
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FisherHypergeometricDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FisherHypergeometricDistribution.html
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
fun fisherHypergeometricDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FisherHypergeometricDistribution", arguments.toMutableList(), options)
}
