package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[1, 0.5, 0]
 *
 * Full name:        Information[RGBColor[1, 0.5, 0], FullName]
 *
 * Usage:            Information[RGBColor[1, 0.5, 0], Usage]
 *
 * Options:          Information[RGBColor[1, 0.5, 0], Options]
 *
 * Attributes:       Information[RGBColor[1, 0.5, 0], Attributes]
 *
 *                   local: <>Information[RGBColor[1, 0.5, 0], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[1, 0.5, 0], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[1, 0.5, 0], Definitions]
 *
 * Own values:       Information[RGBColor[1, 0.5, 0], OwnValues]
 *
 * Down values:      Information[RGBColor[1, 0.5, 0], DownValues]
 *
 * Up values:        Information[RGBColor[1, 0.5, 0], UpValues]
 *
 * Sub values:       Information[RGBColor[1, 0.5, 0], SubValues]
 *
 * Default value:    Information[RGBColor[1, 0.5, 0], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[1, 0.5, 0], NValues]
 */
fun orange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Orange", arguments.toMutableList(), options)
}
