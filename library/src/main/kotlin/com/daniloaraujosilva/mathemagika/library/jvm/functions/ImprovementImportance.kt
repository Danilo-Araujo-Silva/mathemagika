package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImprovementImportance
 *
 * Full name:        System`ImprovementImportance
 *
 *                   ImprovementImportance[rdist, t] gives the improvement importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            ImprovementImportance[fdist, t] gives the improvement importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImprovementImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImprovementImportance.html
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
fun improvementImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImprovementImportance", arguments.toMutableList(), options)
}
