package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PoissonConsulDistribution
 *
 * Full name:        System`PoissonConsulDistribution
 *
 * Usage:            PoissonConsulDistribution[μ, λ] represents a Poisson–Consul distribution with parameters μ and λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PoissonConsulDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/PoissonConsulDistribution.html
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
fun poissonConsulDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PoissonConsulDistribution", arguments.toMutableList(), options)
}
