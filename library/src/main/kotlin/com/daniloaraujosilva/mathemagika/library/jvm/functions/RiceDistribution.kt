package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RiceDistribution
 *
 * Full name:        System`RiceDistribution
 *
 *                   RiceDistribution[α, β] represents a Rice distribution with shape parameters α and β.
 * Usage:            RiceDistribution[m, α, β] represents a Norton–Rice distribution with parameters m, α, and β.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RiceDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/RiceDistribution.html
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
fun riceDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RiceDistribution", arguments.toMutableList(), options)
}
