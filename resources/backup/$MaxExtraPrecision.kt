package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             50.
 *
 * Full name:        Information[50., FullName]
 *
 * Usage:            Information[50., Usage]
 *
 * Options:          Information[50., Options]
 *
 * Attributes:       Information[50., Attributes]
 *
 *                   local: <>Information[50., Documentation][Local]
 * Documentation:    web: <>Information[50., Documentation][Web]
 *
 * Definitions:      Information[50., Definitions]
 *
 * Own values:       Information[50., OwnValues]
 *
 * Down values:      Information[50., DownValues]
 *
 * Up values:        Information[50., UpValues]
 *
 * Sub values:       Information[50., SubValues]
 *
 * Default value:    Information[50., DefaultValues]
 *
 * Numeric values:   Information[50., NValues]
 */
fun `$MaxExtraPrecision`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$MaxExtraPrecision", arguments.toMutableList(), options)
}
