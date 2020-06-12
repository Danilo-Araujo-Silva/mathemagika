package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NoWhitespace
 *
 * Full name:        System`NoWhitespace
 *
 * Usage:            NoWhitespace represents the absence of whitespace between elements in a grammar rules pattern.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NoWhitespace
 * Documentation:    web: http://reference.wolfram.com/language/ref/NoWhitespace.html
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
fun noWhitespace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NoWhitespace", arguments.toMutableList(), options)
}
