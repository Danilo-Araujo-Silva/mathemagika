package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             String
 *
 * Full name:        System`String
 *
 * Usage:            String is the head of a character string "text".
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/String
 * Documentation:    web: http://reference.wolfram.com/language/ref/String.html
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
fun string(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("String", arguments.toMutableList(), options)
}
