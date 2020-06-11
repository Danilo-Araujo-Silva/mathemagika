package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SkewNormalDistribution
 *
 * Full name:        System`SkewNormalDistribution
 *
 * Usage:            SkewNormalDistribution[μ, σ, α] represents a skew-normal distribution with shape parameter α, location parameter μ, and scale parameter σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SkewNormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SkewNormalDistribution.html
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
fun skewNormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SkewNormalDistribution", arguments.toMutableList(), options)
}
