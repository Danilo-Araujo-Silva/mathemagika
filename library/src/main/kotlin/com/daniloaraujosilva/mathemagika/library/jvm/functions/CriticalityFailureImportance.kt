package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CriticalityFailureImportance
 *
 * Full name:        System`CriticalityFailureImportance
 *
 *                   CriticalityFailureImportance[rdist, t] gives the criticality failure importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            CriticalityFailureImportance[fdist, t] gives the criticality failure importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CriticalityFailureImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/CriticalityFailureImportance.html
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
fun criticalityFailureImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CriticalityFailureImportance", arguments.toMutableList(), options)
}
