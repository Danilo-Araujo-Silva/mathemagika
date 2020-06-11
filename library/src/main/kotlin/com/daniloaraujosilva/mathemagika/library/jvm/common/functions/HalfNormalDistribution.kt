package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HalfNormalDistribution
 *
 * Full name:        System`HalfNormalDistribution
 *
 * Usage:            HalfNormalDistribution[θ] represents a half-normal distribution with scale inversely proportional to parameter θ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HalfNormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/HalfNormalDistribution.html
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
fun halfNormalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HalfNormalDistribution", arguments.toMutableList(), options)
}
