package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VarianceGammaDistribution
 *
 * Full name:        System`VarianceGammaDistribution
 *
 * Usage:            VarianceGammaDistribution[λ, α, β, μ] represents a variance‐gamma distribution with location parameter μ, skewness parameter β, and shape parameters λ and α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VarianceGammaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/VarianceGammaDistribution.html
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
fun varianceGammaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VarianceGammaDistribution", arguments.toMutableList(), options)
}
