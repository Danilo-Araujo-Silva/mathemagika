package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExponentialPowerDistribution
 *
 * Full name:        System`ExponentialPowerDistribution
 *
 *                   ExponentialPowerDistribution[κ, μ, σ] represents an exponential power distribution with shape parameter κ, location parameter μ, and scale parameter σ.
 * Usage:            ExponentialPowerDistribution[κ] represents an exponential power distribution with location parameter 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExponentialPowerDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExponentialPowerDistribution.html
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
fun exponentialPowerDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExponentialPowerDistribution", arguments.toMutableList(), options)
}
