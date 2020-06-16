package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DateObject[{2020, 6, 9}, Day, Gregorian, -3.]
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
fun yesterday(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Yesterday", arguments.toMutableList(), options)
}
