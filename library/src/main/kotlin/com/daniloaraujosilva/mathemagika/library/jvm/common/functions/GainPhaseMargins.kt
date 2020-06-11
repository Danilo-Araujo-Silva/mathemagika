package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GainPhaseMargins
 *
 * Full name:        System`GainPhaseMargins
 *
 * Usage:            GainPhaseMargins[lsys] gives the gain and phase margins of the linear time-invariant system lsys.
 *
 *                   FeedbackType -> Negative
 *                   Method -> Automatic
 *                   SamplingPeriod -> None
 *                   Tolerance -> Automatic
 * Options:          VerifySolutions -> True
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GainPhaseMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/GainPhaseMargins.html
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
fun gainPhaseMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GainPhaseMargins", arguments.toMutableList(), options)
}
