package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RiskReductionImportance
 *
 * Full name:        System`RiskReductionImportance
 *
 *                   RiskReductionImportance[rdist, t] gives the risk reduction importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            RiskReductionImportance[fdist, t] gives the risk reduction importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RiskReductionImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/RiskReductionImportance.html
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
fun riskReductionImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RiskReductionImportance", arguments.toMutableList(), options)
}
