package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[1, 1, 0]
 *
 * Full name:        Information[RGBColor[1, 1, 0], FullName]
 *
 * Usage:            Information[RGBColor[1, 1, 0], Usage]
 *
 * Options:          Information[RGBColor[1, 1, 0], Options]
 *
 * Attributes:       Information[RGBColor[1, 1, 0], Attributes]
 *
 *                   local: <>Information[RGBColor[1, 1, 0], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[1, 1, 0], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[1, 1, 0], Definitions]
 *
 * Own values:       Information[RGBColor[1, 1, 0], OwnValues]
 *
 * Down values:      Information[RGBColor[1, 1, 0], DownValues]
 *
 * Up values:        Information[RGBColor[1, 1, 0], UpValues]
 *
 * Sub values:       Information[RGBColor[1, 1, 0], SubValues]
 *
 * Default value:    Information[RGBColor[1, 1, 0], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[1, 1, 0], NValues]
 */
fun yellow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Yellow", arguments.toMutableList(), options)
}
