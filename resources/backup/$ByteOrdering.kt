package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             -1
 *
 * Full name:        Information[-1, FullName]
 *
 * Usage:            Information[-1, Usage]
 *
 * Options:          Information[-1, Options]
 *
 * Attributes:       Information[-1, Attributes]
 *
 *                   local: <>Information[-1, Documentation][Local]
 * Documentation:    web: <>Information[-1, Documentation][Web]
 *
 * Definitions:      Information[-1, Definitions]
 *
 * Own values:       Information[-1, OwnValues]
 *
 * Down values:      Information[-1, DownValues]
 *
 * Up values:        Information[-1, UpValues]
 *
 * Sub values:       Information[-1, SubValues]
 *
 * Default value:    Information[-1, DefaultValues]
 *
 * Numeric values:   Information[-1, NValues]
 */
fun `$ByteOrdering`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$ByteOrdering", arguments.toMutableList(), options)
}
