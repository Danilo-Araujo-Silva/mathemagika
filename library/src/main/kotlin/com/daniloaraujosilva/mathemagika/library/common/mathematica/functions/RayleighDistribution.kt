package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RayleighDistribution
 *
 * Full name:        System`RayleighDistribution
 *
 * Usage:            RayleighDistribution[σ] represents the Rayleigh distribution with scale parameter σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RayleighDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/RayleighDistribution.html
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
fun rayleighDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RayleighDistribution", arguments.toMutableList(), options)
}
