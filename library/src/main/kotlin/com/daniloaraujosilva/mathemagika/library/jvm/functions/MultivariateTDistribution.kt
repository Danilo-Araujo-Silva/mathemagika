package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MultivariateTDistribution
 *
 * Full name:        System`MultivariateTDistribution
 *
 *                   MultivariateTDistribution[Σ, ν] represents the multivariate Student t distribution with scale matrix Σ and degrees of freedom parameter ν.
 * Usage:            MultivariateTDistribution[μ, Σ, ν] represents the multivariate Student t distribution with location μ, scale matrix Σ, and ν degrees of freedom.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MultivariateTDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultivariateTDistribution.html
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
fun multivariateTDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultivariateTDistribution", arguments.toMutableList(), options)
}
