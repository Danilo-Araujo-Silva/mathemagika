package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MaxStepFraction
 *
 * Full name:        System`MaxStepFraction
 *
 * Usage:            MaxStepFraction is an option to functions like NDSolve that specifies the maximum fraction of the total range to cover in a single step.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MaxStepFraction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxStepFraction.html
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
fun maxStepFraction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxStepFraction", arguments.toMutableList(), options)
}
