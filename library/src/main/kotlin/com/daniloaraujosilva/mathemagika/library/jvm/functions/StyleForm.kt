package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StyleForm
 *
 * Full name:        System`StyleForm
 *
 *                   StyleForm[expr, options] prints using the specified style options.
 * Usage:            StyleForm[expr, "style"] prints using the specified cell style in the current notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StyleForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleForm.html
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
fun styleForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleForm", arguments.toMutableList(), options)
}
