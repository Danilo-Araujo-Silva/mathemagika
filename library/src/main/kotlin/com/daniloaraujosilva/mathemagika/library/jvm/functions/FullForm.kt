package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FullForm
 *
 * Full name:        System`FullForm
 *
 * Usage:            FullForm[expr] prints as the full form of expr, with no special syntax.
 *
 * Options:          NumberMarks :> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FullForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/FullForm.html
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
fun fullForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FullForm", arguments.toMutableList(), options)
}
