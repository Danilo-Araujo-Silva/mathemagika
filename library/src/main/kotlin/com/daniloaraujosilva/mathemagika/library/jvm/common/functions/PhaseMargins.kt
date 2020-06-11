package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PhaseMargins
 *
 * Full name:        System`PhaseMargins
 *
 * Usage:            PhaseMargins[lsys] gives the phase margins of the linear time-invariant system lsys.
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
 *                   local: paclet:ref/PhaseMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/PhaseMargins.html
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
fun phaseMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PhaseMargins", arguments.toMutableList(), options)
}
