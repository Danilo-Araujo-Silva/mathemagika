package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LogGammaDistribution
 *
 * Full name:        System`LogGammaDistribution
 *
 * Usage:            LogGammaDistribution[α, β, μ] represents a log-gamma distribution with shape parameters α and β and location parameter μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogGammaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogGammaDistribution.html
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
fun logGammaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogGammaDistribution", arguments.toMutableList(), options)
}
