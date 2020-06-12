package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompoundPoissonDistribution
 *
 * Full name:        System`CompoundPoissonDistribution
 *
 * Usage:            CompoundPoissonDistribution[λ, dist] represents a compound Poisson distribution with rate parameter λ and jump size distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompoundPoissonDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompoundPoissonDistribution.html
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
fun compoundPoissonDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompoundPoissonDistribution", arguments.toMutableList(), options)
}
