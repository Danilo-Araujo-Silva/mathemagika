package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[1, 0, 0]
 *
 * Full name:        Information[RGBColor[1, 0, 0], FullName]
 *
 * Usage:            Information[RGBColor[1, 0, 0], Usage]
 *
 * Options:          Information[RGBColor[1, 0, 0], Options]
 *
 * Attributes:       Information[RGBColor[1, 0, 0], Attributes]
 *
 *                   local: <>Information[RGBColor[1, 0, 0], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[1, 0, 0], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[1, 0, 0], Definitions]
 *
 * Own values:       Information[RGBColor[1, 0, 0], OwnValues]
 *
 * Down values:      Information[RGBColor[1, 0, 0], DownValues]
 *
 * Up values:        Information[RGBColor[1, 0, 0], UpValues]
 *
 * Sub values:       Information[RGBColor[1, 0, 0], SubValues]
 *
 * Default value:    Information[RGBColor[1, 0, 0], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[1, 0, 0], NValues]
 */
fun red(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Red", arguments.toMutableList(), options)
}
