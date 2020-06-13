package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TruncatedDistribution
 *
 * Full name:        System`TruncatedDistribution
 *
 *                   TruncatedDistribution[{x   , x   }, dist] represents the distribution obtained by truncating the values of dist to lie between x    and x   .
 *                                           min   max                                                                                               min      max
 *                   TruncatedDistribution[{{x   , x   }, {y   , y   }, …}, dist] represents the distribution obtained by truncating the values of the multivariate distribution dist to lie between x    and x   , y    and y   , etc.
 * Usage:                                     min   max     min   max                                                                                                                                 min      max   min      max
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TruncatedDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TruncatedDistribution.html
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
fun truncatedDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TruncatedDistribution", arguments.toMutableList(), options)
}
