package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

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
fun `$Echo`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$Echo", arguments.toMutableList(), options)
}
