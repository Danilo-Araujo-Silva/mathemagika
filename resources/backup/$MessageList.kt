package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:
 *
 * Full name:
 *
 * Usage:
 *
 * Options:
 *
 * Attributes:
 *
 *                   local: <>{}[Local]
 * Documentation:    web: <>{}[Web]
 *
 * Definitions:
 *
 * Own values:
 *
 * Down values:
 *
 * Up values:
 *
 * Sub values:
 *
 * Default value:
 *
 * Numeric values:
 */
fun `$MessageList`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$MessageList", arguments.toMutableList(), options)
}
