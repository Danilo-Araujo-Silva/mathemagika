package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Thickness[Large]
 *
 * Full name:        Information[Thickness[Large], FullName]
 *
 * Usage:            Information[Thickness[Large], Usage]
 *
 * Options:          Information[Thickness[Large], Options]
 *
 * Attributes:       Information[Thickness[Large], Attributes]
 *
 *                   local: <>Information[Thickness[Large], Documentation][Local]
 * Documentation:    web: <>Information[Thickness[Large], Documentation][Web]
 *
 * Definitions:      Information[Thickness[Large], Definitions]
 *
 * Own values:       Information[Thickness[Large], OwnValues]
 *
 * Down values:      Information[Thickness[Large], DownValues]
 *
 * Up values:        Information[Thickness[Large], UpValues]
 *
 * Sub values:       Information[Thickness[Large], SubValues]
 *
 * Default value:    Information[Thickness[Large], DefaultValues]
 *
 * Numeric values:   Information[Thickness[Large], NValues]
 */
fun thick(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Thick", arguments.toMutableList(), options)
}
