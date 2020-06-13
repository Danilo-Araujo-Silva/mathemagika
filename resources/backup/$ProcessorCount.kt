package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             4
 *
 * Full name:        Information[4, FullName]
 *
 * Usage:            Information[4, Usage]
 *
 * Options:          Information[4, Options]
 *
 * Attributes:       Information[4, Attributes]
 *
 *                   local: <>Information[4, Documentation][Local]
 * Documentation:    web: <>Information[4, Documentation][Web]
 *
 * Definitions:      Information[4, Definitions]
 *
 * Own values:       Information[4, OwnValues]
 *
 * Down values:      Information[4, DownValues]
 *
 * Up values:        Information[4, UpValues]
 *
 * Sub values:       Information[4, SubValues]
 *
 * Default value:    Information[4, DefaultValues]
 *
 * Numeric values:   Information[4, NValues]
 */
fun `$ProcessorCount`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ProcessorCount", arguments.toMutableList(), options)
}
