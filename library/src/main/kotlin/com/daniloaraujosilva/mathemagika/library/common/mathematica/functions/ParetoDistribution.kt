package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParetoDistribution
 *
 * Full name:        System`ParetoDistribution
 *
 *                   ParetoDistribution[k, α] represents a Pareto distribution with minimum value parameter k and shape parameter α.
 *                   ParetoDistribution[k, α, μ] represents a Pareto type II distribution with location parameter μ.
 * Usage:            ParetoDistribution[k, α, γ, μ] represents a Pareto type IV distribution with shape parameter γ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ParetoDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParetoDistribution.html
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
fun paretoDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParetoDistribution", arguments.toMutableList(), options)
}
