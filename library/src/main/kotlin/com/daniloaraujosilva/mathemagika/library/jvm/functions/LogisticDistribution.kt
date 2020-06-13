package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LogisticDistribution
 *
 * Full name:        System`LogisticDistribution
 *
 *                   LogisticDistribution[μ, β] represents a logistic distribution with mean μ and scale parameter β.
 * Usage:            LogisticDistribution[] represents a logistic distribution with mean 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogisticDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogisticDistribution.html
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
fun logisticDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogisticDistribution", arguments.toMutableList(), options)
}
