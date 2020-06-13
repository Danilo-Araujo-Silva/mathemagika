package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VonMisesDistribution
 *
 * Full name:        System`VonMisesDistribution
 *
 * Usage:            VonMisesDistribution[μ, κ] represents a von Mises distribution with mean μ and concentration κ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VonMisesDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/VonMisesDistribution.html
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
fun vonMisesDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VonMisesDistribution", arguments.toMutableList(), options)
}
