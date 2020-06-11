package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Infinity
 *
 * Full name:        Information[Infinity, FullName]
 *
 * Usage:            Information[Infinity, Usage]
 *
 * Options:          Information[Infinity, Options]
 *
 * Attributes:       Information[Infinity, Attributes]
 *
 *                   local: <>Information[Infinity, Documentation][Local]
 * Documentation:    web: <>Information[Infinity, Documentation][Web]
 *
 * Definitions:      Information[Infinity, Definitions]
 *
 * Own values:       Information[Infinity, OwnValues]
 *
 * Down values:      Information[Infinity, DownValues]
 *
 * Up values:        Information[Infinity, UpValues]
 *
 * Sub values:       Information[Infinity, SubValues]
 *
 * Default value:    Information[Infinity, DefaultValues]
 *
 * Numeric values:   Information[Infinity, NValues]
 */
fun `$HistoryLength`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$HistoryLength", arguments.toMutableList(), options)
}
