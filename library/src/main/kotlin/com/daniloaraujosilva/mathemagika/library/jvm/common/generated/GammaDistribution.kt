package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GammaDistribution
 * 
 * Full name:        System`GammaDistribution
 * 
 *                   GammaDistribution[α, β] represents a gamma distribution with shape parameter α and scale parameter β.
 * Usage:            GammaDistribution[α, β, γ, μ] represents a generalized gamma distribution with shape parameters α and γ, scale parameter β, and location parameter μ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GammaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/GammaDistribution.html
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
fun gammaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GammaDistribution", arguments.toMutableList(), options)
}
