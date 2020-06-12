package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             100
 *
 * Full name:        Information[100, FullName]
 *
 * Usage:            Information[100, Usage]
 *
 * Options:          Information[100, Options]
 *
 * Attributes:       Information[100, Attributes]
 *
 *                   local: <>Information[100, Documentation][Local]
 * Documentation:    web: <>Information[100, Documentation][Web]
 *
 * Definitions:      Information[100, Definitions]
 *
 * Own values:       Information[100, OwnValues]
 *
 * Down values:      Information[100, DownValues]
 *
 * Up values:        Information[100, UpValues]
 *
 * Sub values:       Information[100, SubValues]
 *
 * Default value:    Information[100, DefaultValues]
 *
 * Numeric values:   Information[100, NValues]
 */
fun `$MaxPiecewiseCases`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$MaxPiecewiseCases", arguments.toMutableList(), options)
}
