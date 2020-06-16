package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[0.6, 0.4, 0.2]
 *
 * Full name:        Information[RGBColor[0.6, 0.4, 0.2], FullName]
 *
 * Usage:            Information[RGBColor[0.6, 0.4, 0.2], Usage]
 *
 * Options:          Information[RGBColor[0.6, 0.4, 0.2], Options]
 *
 * Attributes:       Information[RGBColor[0.6, 0.4, 0.2], Attributes]
 *
 *                   local: <>Information[RGBColor[0.6, 0.4, 0.2], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[0.6, 0.4, 0.2], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[0.6, 0.4, 0.2], Definitions]
 *
 * Own values:       Information[RGBColor[0.6, 0.4, 0.2], OwnValues]
 *
 * Down values:      Information[RGBColor[0.6, 0.4, 0.2], DownValues]
 *
 * Up values:        Information[RGBColor[0.6, 0.4, 0.2], UpValues]
 *
 * Sub values:       Information[RGBColor[0.6, 0.4, 0.2], SubValues]
 *
 * Default value:    Information[RGBColor[0.6, 0.4, 0.2], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[0.6, 0.4, 0.2], NValues]
 */
fun brown(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Brown", arguments.toMutableList(), options)
}
