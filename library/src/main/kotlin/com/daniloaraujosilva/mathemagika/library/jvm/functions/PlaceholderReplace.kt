package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlaceholderReplace
 *
 * Full name:        System`PlaceholderReplace
 *
 * Usage:            PlaceholderReplace is an option to Paste that determines whether to replace a selection placeholder with the selected contents.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlaceholderReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlaceholderReplace.html
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
fun placeholderReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlaceholderReplace", arguments.toMutableList(), options)
}
