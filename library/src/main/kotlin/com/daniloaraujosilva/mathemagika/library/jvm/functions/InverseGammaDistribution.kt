package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseGammaDistribution
 *
 * Full name:        System`InverseGammaDistribution
 *
 *                   InverseGammaDistribution[α, β] represents an inverse gamma distribution with shape parameter α and scale parameter β.
 * Usage:            InverseGammaDistribution[α, β, γ, μ] represents a generalized inverse gamma distribution with shape parameters α and γ, scale parameter β, and location parameter μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseGammaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseGammaDistribution.html
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
fun inverseGammaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseGammaDistribution", arguments.toMutableList(), options)
}
