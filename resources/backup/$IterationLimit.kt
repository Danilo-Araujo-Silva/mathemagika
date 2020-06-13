package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             4096
 *
 * Full name:        Information[4096, FullName]
 *
 * Usage:            Information[4096, Usage]
 *
 * Options:          Information[4096, Options]
 *
 * Attributes:       Information[4096, Attributes]
 *
 *                   local: <>Information[4096, Documentation][Local]
 * Documentation:    web: <>Information[4096, Documentation][Web]
 *
 * Definitions:      Information[4096, Definitions]
 *
 * Own values:       Information[4096, OwnValues]
 *
 * Down values:      Information[4096, DownValues]
 *
 * Up values:        Information[4096, UpValues]
 *
 * Sub values:       Information[4096, SubValues]
 *
 * Default value:    Information[4096, DefaultValues]
 *
 * Numeric values:   Information[4096, NValues]
 */
fun `$IterationLimit`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$IterationLimit", arguments.toMutableList(), options)
}
