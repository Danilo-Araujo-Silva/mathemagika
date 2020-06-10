package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindDistributionParameters
 * 
 * Full name:        System`FindDistributionParameters
 * 
 *                   FindDistributionParameters[data, dist] finds the parameter estimates for the distribution dist from data.
 *                   FindDistributionParameters[data, dist, {{p, p }, {q, q }, …}] finds the parameters p, q, … with starting values p , q , ….
 * Usage:                                                         0        0                                                          0   0
 * 
 *                   AccuracyGoal -> Automatic
 *                   ParameterEstimator -> MaximumLikelihood
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FindDistributionParameters
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindDistributionParameters.html
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
fun findDistributionParameters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindDistributionParameters", arguments.toMutableList(), options)
}
