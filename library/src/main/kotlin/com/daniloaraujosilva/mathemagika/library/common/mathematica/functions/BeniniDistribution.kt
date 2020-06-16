package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BeniniDistribution
 *
 * Full name:        System`BeniniDistribution
 *
 * Usage:            BeniniDistribution[α, β, σ] represents a Benini distribution with shape parameters α and β and scale parameter σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BeniniDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BeniniDistribution.html
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
fun beniniDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BeniniDistribution", arguments.toMutableList(), options)
}
