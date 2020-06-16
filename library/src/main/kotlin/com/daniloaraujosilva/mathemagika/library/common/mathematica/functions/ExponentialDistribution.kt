package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExponentialDistribution
 *
 * Full name:        System`ExponentialDistribution
 *
 * Usage:            ExponentialDistribution[λ] represents an exponential distribution with scale inversely proportional to parameter λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExponentialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExponentialDistribution.html
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
fun exponentialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExponentialDistribution", arguments.toMutableList(), options)
}
