package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MeixnerDistribution
 *
 * Full name:        System`MeixnerDistribution
 *
 * Usage:            MeixnerDistribution[a, b, m, d] represents a Meixner distribution with location parameter m, scale parameter a, skew parameter b, and shape parameter d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeixnerDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeixnerDistribution.html
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
fun meixnerDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeixnerDistribution", arguments.toMutableList(), options)
}
