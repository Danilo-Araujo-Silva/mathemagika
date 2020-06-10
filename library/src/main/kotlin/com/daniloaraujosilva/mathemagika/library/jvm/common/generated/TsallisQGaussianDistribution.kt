package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TsallisQGaussianDistribution
 * 
 * Full name:        System`TsallisQGaussianDistribution
 * 
 *                   TsallisQGaussianDistribution[μ, β, q] represents a Tsallis q-Gaussian distribution with mean μ, scale parameter β, and deformation parameter q.
 * Usage:            TsallisQGaussianDistribution[q] represents a Tsallis q-Gaussian distribution with mean 0 and scale parameter 1.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TsallisQGaussianDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TsallisQGaussianDistribution.html
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
fun tsallisQGaussianDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TsallisQGaussianDistribution", arguments.toMutableList(), options)
}
