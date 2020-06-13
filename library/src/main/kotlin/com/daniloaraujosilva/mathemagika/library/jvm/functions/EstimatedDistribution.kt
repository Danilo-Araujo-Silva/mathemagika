package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EstimatedDistribution
 *
 * Full name:        System`EstimatedDistribution
 *
 *                   EstimatedDistribution[data, dist] estimates the parametric distribution dist from data.
 *                   EstimatedDistribution[data, dist, {{p, p }, {q, q }, …}] estimates the parameters p, q, … with starting values p , q , ….
 *                                                           0        0                                                              0   0
 * Usage:            EstimatedDistribution[data, dist, idist] estimates distribution dist with starting values taken from the instantiated distribution idist.
 *
 *                   AccuracyGoal -> Automatic
 *                   ParameterEstimator -> MaximumLikelihood
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EstimatedDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/EstimatedDistribution.html
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
fun estimatedDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EstimatedDistribution", arguments.toMutableList(), options)
}
