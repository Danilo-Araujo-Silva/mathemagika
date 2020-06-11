package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dashing[{0, Small}]
 *
 * Full name:        Information[Dashing[{0, Small}], FullName]
 *
 * Usage:            Information[Dashing[{0, Small}], Usage]
 *
 * Options:          Information[Dashing[{0, Small}], Options]
 *
 * Attributes:       Information[Dashing[{0, Small}], Attributes]
 *
 *                   local: <>Information[Dashing[{0, Small}], Documentation][Local]
 * Documentation:    web: <>Information[Dashing[{0, Small}], Documentation][Web]
 *
 * Definitions:      Information[Dashing[{0, Small}], Definitions]
 *
 * Own values:       Information[Dashing[{0, Small}], OwnValues]
 *
 * Down values:      Information[Dashing[{0, Small}], DownValues]
 *
 * Up values:        Information[Dashing[{0, Small}], UpValues]
 *
 * Sub values:       Information[Dashing[{0, Small}], SubValues]
 *
 * Default value:    Information[Dashing[{0, Small}], DefaultValues]
 *
 * Numeric values:   Information[Dashing[{0, Small}], NValues]
 */
fun dotted(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dotted", arguments.toMutableList(), options)
}
