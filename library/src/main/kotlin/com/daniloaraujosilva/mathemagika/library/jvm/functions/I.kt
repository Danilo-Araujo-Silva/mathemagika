package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             I
 *
 * Full name:        Information[I, FullName]
 *
 * Usage:            Information[I, Usage]
 *
 * Options:          Information[I, Options]
 *
 * Attributes:       Information[I, Attributes]
 *
 *                   local: <>Information[I, Documentation][Local]
 * Documentation:    web: <>Information[I, Documentation][Web]
 *
 * Definitions:      Information[I, Definitions]
 *
 * Own values:       Information[I, OwnValues]
 *
 * Down values:      Information[I, DownValues]
 *
 * Up values:        Information[I, UpValues]
 *
 * Sub values:       Information[I, SubValues]
 *
 * Default value:    Information[I, DefaultValues]
 *
 * Numeric values:   Information[I, NValues]
 */
fun i(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("I", arguments.toMutableList(), options)
}
