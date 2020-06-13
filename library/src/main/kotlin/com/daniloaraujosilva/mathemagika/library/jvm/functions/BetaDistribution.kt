package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BetaDistribution
 *
 * Full name:        System`BetaDistribution
 *
 * Usage:            BetaDistribution[α, β] represents a continuous beta distribution with shape parameters α and β.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BetaDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BetaDistribution.html
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
fun betaDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BetaDistribution", arguments.toMutableList(), options)
}
