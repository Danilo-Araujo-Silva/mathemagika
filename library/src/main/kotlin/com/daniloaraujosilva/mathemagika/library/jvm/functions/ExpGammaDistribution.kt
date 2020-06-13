package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExpGammaDistribution
 *
 * Full name:        System`ExpGammaDistribution
 *
 * Usage:            ExpGammaDistribution[κ, θ, μ] represents an exp-gamma distribution with shape parameter κ, scale parameter θ, and location parameter μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExpGammaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpGammaDistribution.html
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
fun expGammaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpGammaDistribution", arguments.toMutableList(), options)
}
