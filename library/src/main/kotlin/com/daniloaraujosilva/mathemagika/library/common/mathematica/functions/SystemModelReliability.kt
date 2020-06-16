package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemModelReliability
 *
 * Full name:        System`SystemModelReliability
 *
 *                   SystemModelReliability[model] retrieves the lifetime distribution for model.
 *                   SystemModelReliability[model, "Components"] gives a list of components in ReliabilityDistribution or FailureDistribution.
 * Usage:            SystemModelReliability[model, "ComponentRules"] gives a list of translation rules for components.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemModelReliability
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemModelReliability.html
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
fun systemModelReliability(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemModelReliability", arguments.toMutableList(), options)
}
