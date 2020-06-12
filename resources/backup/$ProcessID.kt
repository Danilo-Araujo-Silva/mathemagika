package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             13330
 *
 * Full name:        Information[13330, FullName]
 *
 * Usage:            Information[13330, Usage]
 *
 * Options:          Information[13330, Options]
 *
 * Attributes:       Information[13330, Attributes]
 *
 *                   local: <>Information[13330, Documentation][Local]
 * Documentation:    web: <>Information[13330, Documentation][Web]
 *
 * Definitions:      Information[13330, Definitions]
 *
 * Own values:       Information[13330, OwnValues]
 *
 * Down values:      Information[13330, DownValues]
 *
 * Up values:        Information[13330, UpValues]
 *
 * Sub values:       Information[13330, SubValues]
 *
 * Default value:    Information[13330, DefaultValues]
 *
 * Numeric values:   Information[13330, NValues]
 */
fun `$ProcessID`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ProcessID", arguments.toMutableList(), options)
}
