package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LogLogisticDistribution
 *
 * Full name:        System`LogLogisticDistribution
 *
 * Usage:            LogLogisticDistribution[γ, σ] represents a log-logistic distribution with shape parameter γ and scale parameter σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogLogisticDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogLogisticDistribution.html
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
fun logLogisticDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogLogisticDistribution", arguments.toMutableList(), options)
}
