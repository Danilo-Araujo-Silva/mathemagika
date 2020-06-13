package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             1000
 *
 * Full name:        Information[1000, FullName]
 *
 * Usage:            Information[1000, Usage]
 *
 * Options:          Information[1000, Options]
 *
 * Attributes:       Information[1000, Attributes]
 *
 *                   local: <>Information[1000, Documentation][Local]
 * Documentation:    web: <>Information[1000, Documentation][Web]
 *
 * Definitions:      Information[1000, Definitions]
 *
 * Own values:       Information[1000, OwnValues]
 *
 * Down values:      Information[1000, DownValues]
 *
 * Up values:        Information[1000, UpValues]
 *
 * Sub values:       Information[1000, SubValues]
 *
 * Default value:    Information[1000, DefaultValues]
 *
 * Numeric values:   Information[1000, NValues]
 */
fun `$MaxRootDegree`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$MaxRootDegree", arguments.toMutableList(), options)
}
