package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DateObject[{2020, 6, 11}, Day, Gregorian, -3.]
 *
 * Full name:        Missing[UnknownProperty, FullName]
 *
 * Usage:            Missing[UnknownProperty, Usage]
 *
 * Options:          Missing[UnknownProperty, Options]
 *
 * Attributes:       Missing[UnknownProperty, Attributes]
 *
 *                   local: <>Missing[UnknownProperty, Documentation][Local]
 * Documentation:    web: <>Missing[UnknownProperty, Documentation][Web]
 *
 * Definitions:      Missing[UnknownProperty, Definitions]
 *
 * Own values:       Missing[UnknownProperty, OwnValues]
 *
 * Down values:      Missing[UnknownProperty, DownValues]
 *
 * Up values:        Missing[UnknownProperty, UpValues]
 *
 * Sub values:       Missing[UnknownProperty, SubValues]
 *
 * Default value:    Missing[UnknownProperty, DefaultValues]
 *
 * Numeric values:   Missing[UnknownProperty, NValues]
 */
fun tomorrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tomorrow", arguments.toMutableList(), options)
}