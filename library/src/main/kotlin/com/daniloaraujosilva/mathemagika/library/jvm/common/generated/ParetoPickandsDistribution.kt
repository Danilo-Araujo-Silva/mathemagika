package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParetoPickandsDistribution
 * 
 * Full name:        System`ParetoPickandsDistribution
 * 
 *                   ParetoPickandsDistribution[μ, σ, ξ] gives a Pareto–Pickands distribution with location parameter μ, scale parameter σ and shape parameter ξ.
 * Usage:            ParetoPickandsDistribution[ξ] gives the standard Pareto–Pickands distribution with zero location and unit scale parameters.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ParetoPickandsDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParetoPickandsDistribution.html
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
fun paretoPickandsDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParetoPickandsDistribution", arguments.toMutableList(), options)
}
