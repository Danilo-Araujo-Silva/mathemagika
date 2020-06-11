package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrechetDistribution
 *
 * Full name:        System`FrechetDistribution
 *
 *                   FrechetDistribution[α, β] represents the Fréchet distribution with shape parameter α and scale parameter β.
 * Usage:            FrechetDistribution[α, β, μ] represents the Fréchet distribution with shape parameter α, scale parameter β, and location parameter μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FrechetDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrechetDistribution.html
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
fun frechetDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrechetDistribution", arguments.toMutableList(), options)
}
