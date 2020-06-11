package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Thickness[Tiny]
 *
 * Full name:        Information[Thickness[Tiny], FullName]
 *
 * Usage:            Information[Thickness[Tiny], Usage]
 *
 * Options:          Information[Thickness[Tiny], Options]
 *
 * Attributes:       Information[Thickness[Tiny], Attributes]
 *
 *                   local: <>Information[Thickness[Tiny], Documentation][Local]
 * Documentation:    web: <>Information[Thickness[Tiny], Documentation][Web]
 *
 * Definitions:      Information[Thickness[Tiny], Definitions]
 *
 * Own values:       Information[Thickness[Tiny], OwnValues]
 *
 * Down values:      Information[Thickness[Tiny], DownValues]
 *
 * Up values:        Information[Thickness[Tiny], UpValues]
 *
 * Sub values:       Information[Thickness[Tiny], SubValues]
 *
 * Default value:    Information[Thickness[Tiny], DefaultValues]
 *
 * Numeric values:   Information[Thickness[Tiny], NValues]
 */
fun thin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Thin", arguments.toMutableList(), options)
}
