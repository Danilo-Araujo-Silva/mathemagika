package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[0, 0, 1]
 *
 * Full name:        Information[RGBColor[0, 0, 1], FullName]
 *
 * Usage:            Information[RGBColor[0, 0, 1], Usage]
 *
 * Options:          Information[RGBColor[0, 0, 1], Options]
 *
 * Attributes:       Information[RGBColor[0, 0, 1], Attributes]
 *
 *                   local: <>Information[RGBColor[0, 0, 1], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[0, 0, 1], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[0, 0, 1], Definitions]
 *
 * Own values:       Information[RGBColor[0, 0, 1], OwnValues]
 *
 * Down values:      Information[RGBColor[0, 0, 1], DownValues]
 *
 * Up values:        Information[RGBColor[0, 0, 1], UpValues]
 *
 * Sub values:       Information[RGBColor[0, 0, 1], SubValues]
 *
 * Default value:    Information[RGBColor[0, 0, 1], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[0, 0, 1], NValues]
 */
fun blue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Blue", arguments.toMutableList(), options)
}
