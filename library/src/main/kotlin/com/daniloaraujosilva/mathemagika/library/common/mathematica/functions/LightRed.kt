package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[1, 0.85, 0.85]
 *
 * Full name:        Information[RGBColor[1, 0.85, 0.85], FullName]
 *
 * Usage:            Information[RGBColor[1, 0.85, 0.85], Usage]
 *
 * Options:          Information[RGBColor[1, 0.85, 0.85], Options]
 *
 * Attributes:       Information[RGBColor[1, 0.85, 0.85], Attributes]
 *
 *                   local: <>Information[RGBColor[1, 0.85, 0.85], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[1, 0.85, 0.85], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[1, 0.85, 0.85], Definitions]
 *
 * Own values:       Information[RGBColor[1, 0.85, 0.85], OwnValues]
 *
 * Down values:      Information[RGBColor[1, 0.85, 0.85], DownValues]
 *
 * Up values:        Information[RGBColor[1, 0.85, 0.85], UpValues]
 *
 * Sub values:       Information[RGBColor[1, 0.85, 0.85], SubValues]
 *
 * Default value:    Information[RGBColor[1, 0.85, 0.85], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[1, 0.85, 0.85], NValues]
 */
fun lightRed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LightRed", arguments.toMutableList(), options)
}
