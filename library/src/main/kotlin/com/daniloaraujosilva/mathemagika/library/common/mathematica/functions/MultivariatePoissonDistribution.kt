package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MultivariatePoissonDistribution
 *
 * Full name:        System`MultivariatePoissonDistribution
 *
 *                   MultivariatePoissonDistribution[μ , {μ , μ , …}] represents a multivariate Poisson distribution with mean vector {μ  + μ , μ  + μ , …}.
 * Usage:                                             0    1   2                                                                        0    1   0    2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MultivariatePoissonDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultivariatePoissonDistribution.html
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
fun multivariatePoissonDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultivariatePoissonDistribution", arguments.toMutableList(), options)
}
