package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BiquadraticFilterModel
 *
 * Full name:        System`BiquadraticFilterModel
 *
 *                   BiquadraticFilterModel[{ω, q}] creates a lowpass biquadratic filter using the characteristic frequency ω and the quality factor q.
 *                   BiquadraticFilterModel[{"type", spec}] creates a filter of a given {"type", spec}.
 * Usage:            BiquadraticFilterModel[{"type", spec}, var] expresses the model in terms of the variable var.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BiquadraticFilterModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/BiquadraticFilterModel.html
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
fun biquadraticFilterModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BiquadraticFilterModel", arguments.toMutableList(), options)
}
