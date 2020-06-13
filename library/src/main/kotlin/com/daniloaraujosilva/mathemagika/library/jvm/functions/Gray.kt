package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GrayLevel[0.5]
 *
 * Full name:        Information[GrayLevel[0.5], FullName]
 *
 * Usage:            Information[GrayLevel[0.5], Usage]
 *
 * Options:          Information[GrayLevel[0.5], Options]
 *
 * Attributes:       Information[GrayLevel[0.5], Attributes]
 *
 *                   local: <>Information[GrayLevel[0.5], Documentation][Local]
 * Documentation:    web: <>Information[GrayLevel[0.5], Documentation][Web]
 *
 * Definitions:      Information[GrayLevel[0.5], Definitions]
 *
 * Own values:       Information[GrayLevel[0.5], OwnValues]
 *
 * Down values:      Information[GrayLevel[0.5], DownValues]
 *
 * Up values:        Information[GrayLevel[0.5], UpValues]
 *
 * Sub values:       Information[GrayLevel[0.5], SubValues]
 *
 * Default value:    Information[GrayLevel[0.5], DefaultValues]
 *
 * Numeric values:   Information[GrayLevel[0.5], NValues]
 */
fun gray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Gray", arguments.toMutableList(), options)
}
