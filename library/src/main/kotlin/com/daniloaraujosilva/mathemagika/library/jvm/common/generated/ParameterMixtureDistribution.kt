package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParameterMixtureDistribution
 * 
 * Full name:        System`ParameterMixtureDistribution
 * 
 *                   ParameterMixtureDistribution[dist[θ], θ  wdist] represents a parameter mixture distribution where the parameter θ is distributed according to the weight distribution wdist. 
 *                   ParameterMixtureDistribution[dist[θ , θ , …], {θ   wdist , θ   wdist , …}] represents a parameter mixture distribution where the parameter θ  has weight distribution wdist , θ  has weight distribution wdist , etc. 
 * Usage:                                               1   2        1        1   2        2                                                                       1                              1   2                              2
 * 
 * Options:          Assumptions -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ParameterMixtureDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParameterMixtureDistribution.html
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
fun parameterMixtureDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParameterMixtureDistribution", arguments.toMutableList(), options)
}
