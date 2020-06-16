package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LogMultinormalDistribution
 *
 * Full name:        System`LogMultinormalDistribution
 *
 * Usage:            LogMultinormalDistribution[μ, Σ] represents a log-multinormal distribution with parameters μ and Σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogMultinormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogMultinormalDistribution.html
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
fun logMultinormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogMultinormalDistribution", arguments.toMutableList(), options)
}
