package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TsallisQExponentialDistribution
 *
 * Full name:        System`TsallisQExponentialDistribution
 *
 * Usage:            TsallisQExponentialDistribution[λ, q] represents a Tsallis q-exponential distribution with scale inversely proportional to parameter λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TsallisQExponentialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/TsallisQExponentialDistribution.html
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
fun tsallisQExponentialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TsallisQExponentialDistribution", arguments.toMutableList(), options)
}
