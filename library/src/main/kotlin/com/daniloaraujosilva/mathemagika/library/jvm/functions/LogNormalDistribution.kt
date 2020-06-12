package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LogNormalDistribution
 *
 * Full name:        System`LogNormalDistribution
 *
 * Usage:            LogNormalDistribution[μ, σ] represents a lognormal distribution derived from a normal distribution with mean μ and standard deviation σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogNormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogNormalDistribution.html
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
fun logNormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogNormalDistribution", arguments.toMutableList(), options)
}
