package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GrayLevel[0]
 *
 * Full name:        Information[GrayLevel[0], FullName]
 *
 * Usage:            Information[GrayLevel[0], Usage]
 *
 * Options:          Information[GrayLevel[0], Options]
 *
 * Attributes:       Information[GrayLevel[0], Attributes]
 *
 *                   local: <>Information[GrayLevel[0], Documentation][Local]
 * Documentation:    web: <>Information[GrayLevel[0], Documentation][Web]
 *
 * Definitions:      Information[GrayLevel[0], Definitions]
 *
 * Own values:       Information[GrayLevel[0], OwnValues]
 *
 * Down values:      Information[GrayLevel[0], DownValues]
 *
 * Up values:        Information[GrayLevel[0], UpValues]
 *
 * Sub values:       Information[GrayLevel[0], SubValues]
 *
 * Default value:    Information[GrayLevel[0], DefaultValues]
 *
 * Numeric values:   Information[GrayLevel[0], NValues]
 */
fun black(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Black", arguments.toMutableList(), options)
}
