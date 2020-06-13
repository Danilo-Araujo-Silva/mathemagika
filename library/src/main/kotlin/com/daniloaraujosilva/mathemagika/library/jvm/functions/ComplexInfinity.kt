package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ComplexInfinity
 *
 * Full name:        Information[ComplexInfinity, FullName]
 *
 * Usage:            Information[ComplexInfinity, Usage]
 *
 * Options:          Information[ComplexInfinity, Options]
 *
 * Attributes:       Information[ComplexInfinity, Attributes]
 *
 *                   local: <>Information[ComplexInfinity, Documentation][Local]
 * Documentation:    web: <>Information[ComplexInfinity, Documentation][Web]
 *
 * Definitions:      Information[ComplexInfinity, Definitions]
 *
 * Own values:       Information[ComplexInfinity, OwnValues]
 *
 * Down values:      Information[ComplexInfinity, DownValues]
 *
 * Up values:        Information[ComplexInfinity, UpValues]
 *
 * Sub values:       Information[ComplexInfinity, SubValues]
 *
 * Default value:    Information[ComplexInfinity, DefaultValues]
 *
 * Numeric values:   Information[ComplexInfinity, NValues]
 */
fun complexInfinity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComplexInfinity", arguments.toMutableList(), options)
}
