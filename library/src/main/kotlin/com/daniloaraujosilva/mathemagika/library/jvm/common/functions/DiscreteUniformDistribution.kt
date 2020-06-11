package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteUniformDistribution
 *
 * Full name:        System`DiscreteUniformDistribution
 *
 *                   DiscreteUniformDistribution[{i   , i   }] represents a discrete uniform distribution over the integers from i    to i   .
 *                                                 min   max                                                                      min     max
 *                   DiscreteUniformDistribution[{{i   , i   }, {j   , j   }, …}] represents a multivariate discrete uniform distribution over integers within the box {{i   , i   }, {j   , j   }, …}.
 * Usage:                                           min   max     min   max                                                                                               min   max     min   max
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteUniformDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteUniformDistribution.html
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
fun discreteUniformDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteUniformDistribution", arguments.toMutableList(), options)
}
