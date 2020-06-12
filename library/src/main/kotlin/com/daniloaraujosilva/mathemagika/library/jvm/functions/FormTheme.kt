package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FormTheme
 *
 * Full name:        System`FormTheme
 *
 * Usage:            FormTheme is an option for FormObject and related functions that specifies an overall theme for a form and its elements.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FormTheme
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormTheme.html
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
fun formTheme(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormTheme", arguments.toMutableList(), options)
}
