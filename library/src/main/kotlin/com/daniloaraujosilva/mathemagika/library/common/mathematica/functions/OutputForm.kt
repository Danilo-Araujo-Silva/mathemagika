package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             OutputForm
 *
 * Full name:        System`OutputForm
 *
 * Usage:            OutputForm[expr] prints as a two-dimensional representation of expr using only keyboard characters.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OutputForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputForm.html
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
fun outputForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputForm", arguments.toMutableList(), options)
}
