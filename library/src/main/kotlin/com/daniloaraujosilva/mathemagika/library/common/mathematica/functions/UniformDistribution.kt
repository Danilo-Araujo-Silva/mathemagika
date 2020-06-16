package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UniformDistribution
 *
 * Full name:        System`UniformDistribution
 *
 *                   UniformDistribution[{min, max}] represents a continuous uniform statistical distribution giving values between min and max.
 *                   UniformDistribution[] represents a uniform distribution giving values between 0 and 1.
 *                   UniformDistribution[{{x   , x   }, {y   , y   }, …}] represents a multivariate uniform distribution over the region {{x   , x   }, {y   , y   }, …}.
 *                                          min   max     min   max                                                                         min   max     min   max
 * Usage:            UniformDistribution[n] represents a multivariate uniform distribution over the standard n dimensional unit hypercube.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UniformDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/UniformDistribution.html
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
fun uniformDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UniformDistribution", arguments.toMutableList(), options)
}
