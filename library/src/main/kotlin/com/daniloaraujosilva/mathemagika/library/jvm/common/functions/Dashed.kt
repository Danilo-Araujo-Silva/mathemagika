package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dashing[{Small, Small}]
 *
 * Full name:        Information[Dashing[{Small, Small}], FullName]
 *
 * Usage:            Information[Dashing[{Small, Small}], Usage]
 *
 * Options:          Information[Dashing[{Small, Small}], Options]
 *
 * Attributes:       Information[Dashing[{Small, Small}], Attributes]
 *
 *                   local: <>Information[Dashing[{Small, Small}], Documentation][Local]
 * Documentation:    web: <>Information[Dashing[{Small, Small}], Documentation][Web]
 *
 * Definitions:      Information[Dashing[{Small, Small}], Definitions]
 *
 * Own values:       Information[Dashing[{Small, Small}], OwnValues]
 *
 * Down values:      Information[Dashing[{Small, Small}], DownValues]
 *
 * Up values:        Information[Dashing[{Small, Small}], UpValues]
 *
 * Sub values:       Information[Dashing[{Small, Small}], SubValues]
 *
 * Default value:    Information[Dashing[{Small, Small}], DefaultValues]
 *
 * Numeric values:   Information[Dashing[{Small, Small}], NValues]
 */
fun dashed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dashed", arguments.toMutableList(), options)
}
