package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Infinity
 *
 * Full name:        Information[Infinity, FullName]
 *
 * Usage:            Information[Infinity, Usage]
 *
 * Options:          Information[Infinity, Options]
 *
 * Attributes:       Information[Infinity, Attributes]
 *
 *                   local: <>Information[Infinity, Documentation][Local]
 * Documentation:    web: <>Information[Infinity, Documentation][Web]
 *
 * Definitions:      Information[Infinity, Definitions]
 *
 * Own values:       Information[Infinity, OwnValues]
 *
 * Down values:      Information[Infinity, DownValues]
 *
 * Up values:        Information[Infinity, UpValues]
 *
 * Sub values:       Information[Infinity, SubValues]
 *
 * Default value:    Information[Infinity, DefaultValues]
 *
 * Numeric values:   Information[Infinity, NValues]
 */
fun infinity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Infinity", arguments.toMutableList(), options)
}
