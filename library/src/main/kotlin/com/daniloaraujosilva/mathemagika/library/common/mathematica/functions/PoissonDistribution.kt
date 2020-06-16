package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PoissonDistribution
 *
 * Full name:        System`PoissonDistribution
 *
 * Usage:            PoissonDistribution[μ] represents a Poisson distribution with mean μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PoissonDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/PoissonDistribution.html
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
fun poissonDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PoissonDistribution", arguments.toMutableList(), options)
}
