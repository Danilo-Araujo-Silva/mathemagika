package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HjorthDistribution
 *
 * Full name:        System`HjorthDistribution
 *
 * Usage:            HjorthDistribution[m, s, f] represents the Hjorth distribution with location parameter m, scale parameter s, and shape parameter f.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HjorthDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HjorthDistribution.html
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
fun hjorthDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HjorthDistribution", arguments.toMutableList(), options)
}
