package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HyperbolicDistribution
 *
 * Full name:        System`HyperbolicDistribution
 *
 *                   HyperbolicDistribution[α, β, δ, μ] represents a hyperbolic distribution with location parameter μ, scale parameter δ, shape parameter α, and skewness parameter β.
 * Usage:            HyperbolicDistribution[λ, α, β, δ, μ] represents a generalized hyperbolic distribution with shape parameter λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HyperbolicDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HyperbolicDistribution.html
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
fun hyperbolicDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HyperbolicDistribution", arguments.toMutableList(), options)
}
