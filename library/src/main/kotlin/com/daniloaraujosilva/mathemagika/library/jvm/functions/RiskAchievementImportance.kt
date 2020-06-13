package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RiskAchievementImportance
 *
 * Full name:        System`RiskAchievementImportance
 *
 *                   RiskAchievementImportance[rdist, t] gives the risk achievement importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            RiskAchievementImportance[fdist, t] gives the risk achievement importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RiskAchievementImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/RiskAchievementImportance.html
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
fun riskAchievementImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RiskAchievementImportance", arguments.toMutableList(), options)
}
