package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BirnbaumImportance
 *
 * Full name:        System`BirnbaumImportance
 *
 *                   BirnbaumImportance[rdist, t] gives the Birnbaum importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            BirnbaumImportance[fdist, t] gives the Birnbaum importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BirnbaumImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/BirnbaumImportance.html
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
fun birnbaumImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BirnbaumImportance", arguments.toMutableList(), options)
}
