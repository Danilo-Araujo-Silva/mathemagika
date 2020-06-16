package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MarginalDistribution
 *
 * Full name:        System`MarginalDistribution
 *
 *                                                                                                        th
 *                   MarginalDistribution[dist, k] represents a univariate marginal distribution of the k   coordinate from the multivariate distribution dist.
 *                   MarginalDistribution[dist, {k , k , …}] represents a multivariate marginal distribution of the {k , k , …} coordinates.
 * Usage:                                         1   2                                                               1   2
 *
 * Options:          None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MarginalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MarginalDistribution.html
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
fun marginalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MarginalDistribution", arguments.toMutableList(), options)
}
