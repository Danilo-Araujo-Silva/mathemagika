package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BarlowProschanImportance
 *
 * Full name:        System`BarlowProschanImportance
 *
 *                   BarlowProschanImportance[rdist] gives the Barlow–Proschan importances for all components in the ReliabilityDistribution rdist.
 * Usage:            BarlowProschanImportance[fdist] gives the Barlow–Proschan importances for all components in the FailureDistribution fdist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BarlowProschanImportance
 * Documentation:    web: http://reference.wolfram.com/language/ref/BarlowProschanImportance.html
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
fun barlowProschanImportance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BarlowProschanImportance", arguments.toMutableList(), options)
}
