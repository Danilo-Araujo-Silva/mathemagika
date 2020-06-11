package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CriticalitySuccessImportance
 *
 * Full name:        System`CriticalitySuccessImportance
 *
 *                   CriticalitySuccessImportance[rdist, t] gives the criticality success importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            CriticalitySuccessImportance[fdist, t] gives the criticality success importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CriticalitySuccessImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/CriticalitySuccessImportance.html
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
fun criticalitySuccessImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CriticalitySuccessImportance", arguments.toMutableList(), options)
}
