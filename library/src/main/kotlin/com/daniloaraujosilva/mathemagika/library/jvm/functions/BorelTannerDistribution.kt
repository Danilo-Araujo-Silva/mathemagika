package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BorelTannerDistribution
 *
 * Full name:        System`BorelTannerDistribution
 *
 * Usage:            BorelTannerDistribution[α, n] represents a Borel–Tanner distribution with shape parameters α and n.
 *
 * Options:          None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BorelTannerDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BorelTannerDistribution.html
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
fun borelTannerDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BorelTannerDistribution", arguments.toMutableList(), options)
}
