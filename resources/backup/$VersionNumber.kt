package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             12.1
 *
 * Full name:        Information[12.1, FullName]
 *
 * Usage:            Information[12.1, Usage]
 *
 * Options:          Information[12.1, Options]
 *
 * Attributes:       Information[12.1, Attributes]
 *
 *                   local: <>Information[12.1, Documentation][Local]
 * Documentation:    web: <>Information[12.1, Documentation][Web]
 *
 * Definitions:      Information[12.1, Definitions]
 *
 * Own values:       Information[12.1, OwnValues]
 *
 * Down values:      Information[12.1, DownValues]
 *
 * Up values:        Information[12.1, UpValues]
 *
 * Sub values:       Information[12.1, SubValues]
 *
 * Default value:    Information[12.1, DefaultValues]
 *
 * Numeric values:   Information[12.1, NValues]
 */
fun `$VersionNumber`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$VersionNumber", arguments.toMutableList(), options)
}
