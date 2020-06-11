package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             0
 *
 * Full name:        Information[0, FullName]
 *
 * Usage:            Information[0, Usage]
 *
 * Options:          Information[0, Options]
 *
 * Attributes:       Information[0, Attributes]
 *
 *                   local: <>Information[0, Documentation][Local]
 * Documentation:    web: <>Information[0, Documentation][Web]
 *
 * Definitions:      Information[0, Definitions]
 *
 * Own values:       Information[0, OwnValues]
 *
 * Down values:      Information[0, DownValues]
 *
 * Up values:        Information[0, UpValues]
 *
 * Sub values:       Information[0, SubValues]
 *
 * Default value:    Information[0, DefaultValues]
 *
 * Numeric values:   Information[0, NValues]
 */
fun `$ReleaseNumber`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ReleaseNumber", arguments.toMutableList(), options)
}
