package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WindowOpacity
 *
 * Full name:        System`WindowOpacity
 *
 * Usage:            WindowOpacity is a notebook option that determines the overall opacity of a displayed window.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowOpacity
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowOpacity.html
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
fun windowOpacity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowOpacity", arguments.toMutableList(), options)
}
