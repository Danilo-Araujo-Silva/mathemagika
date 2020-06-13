package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FussellVeselyImportance
 *
 * Full name:        System`FussellVeselyImportance
 *
 *                   FussellVeselyImportance[rdist, t] gives the Fussell–Vesely importances for all components in the ReliabilityDistribution rdist at time t.
 * Usage:            FussellVeselyImportance[fdist, t] gives the Fussell–Vesely importances for all components in the FailureDistribution fdist at time t.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FussellVeselyImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/FussellVeselyImportance.html
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
fun fussellVeselyImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FussellVeselyImportance", arguments.toMutableList(), options)
}
