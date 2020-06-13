package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TraditionalForm
 *
 * Full name:        System`TraditionalForm
 *
 * Usage:            TraditionalForm[expr] prints as an approximation to the traditional mathematical notation for expr.
 *
 * Options:          ParameterVariables -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TraditionalForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraditionalForm.html
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
fun traditionalForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraditionalForm", arguments.toMutableList(), options)
}
