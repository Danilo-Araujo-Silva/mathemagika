package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RGBColor[0.5, 0, 0.5]
 *
 * Full name:        Information[RGBColor[0.5, 0, 0.5], FullName]
 *
 * Usage:            Information[RGBColor[0.5, 0, 0.5], Usage]
 *
 * Options:          Information[RGBColor[0.5, 0, 0.5], Options]
 *
 * Attributes:       Information[RGBColor[0.5, 0, 0.5], Attributes]
 *
 *                   local: <>Information[RGBColor[0.5, 0, 0.5], Documentation][Local]
 * Documentation:    web: <>Information[RGBColor[0.5, 0, 0.5], Documentation][Web]
 *
 * Definitions:      Information[RGBColor[0.5, 0, 0.5], Definitions]
 *
 * Own values:       Information[RGBColor[0.5, 0, 0.5], OwnValues]
 *
 * Down values:      Information[RGBColor[0.5, 0, 0.5], DownValues]
 *
 * Up values:        Information[RGBColor[0.5, 0, 0.5], UpValues]
 *
 * Sub values:       Information[RGBColor[0.5, 0, 0.5], SubValues]
 *
 * Default value:    Information[RGBColor[0.5, 0, 0.5], DefaultValues]
 *
 * Numeric values:   Information[RGBColor[0.5, 0, 0.5], NValues]
 */
fun purple(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Purple", arguments.toMutableList(), options)
}
