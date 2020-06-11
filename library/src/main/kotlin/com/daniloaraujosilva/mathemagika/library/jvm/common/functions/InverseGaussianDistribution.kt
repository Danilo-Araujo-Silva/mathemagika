package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseGaussianDistribution
 *
 * Full name:        System`InverseGaussianDistribution
 *
 *                   InverseGaussianDistribution[μ, λ] represents an inverse Gaussian distribution with mean μ and scale parameter λ.
 * Usage:            InverseGaussianDistribution[μ, λ, θ] represents a generalized inverse Gaussian distribution with parameters μ, λ, and θ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseGaussianDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseGaussianDistribution.html
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
fun inverseGaussianDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseGaussianDistribution", arguments.toMutableList(), options)
}
