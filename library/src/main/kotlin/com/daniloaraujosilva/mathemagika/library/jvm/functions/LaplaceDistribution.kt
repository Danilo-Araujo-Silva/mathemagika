package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LaplaceDistribution
 *
 * Full name:        System`LaplaceDistribution
 *
 *                   LaplaceDistribution[μ, β] represents a Laplace double-exponential distribution with mean μ and scale parameter β.
 * Usage:            LaplaceDistribution[] represents a Laplace double-exponential distribution with mean 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LaplaceDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LaplaceDistribution.html
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
fun laplaceDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LaplaceDistribution", arguments.toMutableList(), options)
}
