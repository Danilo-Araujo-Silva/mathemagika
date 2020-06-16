package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CensoredDistribution
 *
 * Full name:        System`CensoredDistribution
 *
 *                   CensoredDistribution[{x   , x   }, dist] represents the distribution of values that come from dist and are censored to be between x    and x   .
 *                                          min   max                                                                                                   min      max
 *                   CensoredDistribution[{{x   , x   }, {y   , y   }, …}, dist] represents the distribution of values that come from the multivariate distribution dist and are censored to be between x    and x   , y    and y   , etc.
 * Usage:                                    min   max     min   max                                                                                                                                     min      max   min      max
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CensoredDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CensoredDistribution.html
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
fun censoredDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CensoredDistribution", arguments.toMutableList(), options)
}
