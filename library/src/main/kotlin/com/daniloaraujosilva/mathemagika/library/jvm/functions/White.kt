package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GrayLevel[1]
 *
 * Full name:        Information[GrayLevel[1], FullName]
 *
 * Usage:            Information[GrayLevel[1], Usage]
 *
 * Options:          Information[GrayLevel[1], Options]
 *
 * Attributes:       Information[GrayLevel[1], Attributes]
 *
 *                   local: <>Information[GrayLevel[1], Documentation][Local]
 * Documentation:    web: <>Information[GrayLevel[1], Documentation][Web]
 *
 * Definitions:      Information[GrayLevel[1], Definitions]
 *
 * Own values:       Information[GrayLevel[1], OwnValues]
 *
 * Down values:      Information[GrayLevel[1], DownValues]
 *
 * Up values:        Information[GrayLevel[1], UpValues]
 *
 * Sub values:       Information[GrayLevel[1], SubValues]
 *
 * Default value:    Information[GrayLevel[1], DefaultValues]
 *
 * Numeric values:   Information[GrayLevel[1], NValues]
 */
fun white(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("White", arguments.toMutableList(), options)
}
