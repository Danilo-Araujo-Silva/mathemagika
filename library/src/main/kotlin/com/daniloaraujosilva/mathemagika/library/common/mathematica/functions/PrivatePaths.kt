package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrivatePaths
 *
 * Full name:        System`PrivatePaths
 *
 * Usage:            PrivatePaths is a global option that specifies settings for paths private to the notebook front end.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrivatePaths
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrivatePaths.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun privatePaths(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrivatePaths", arguments.toMutableList(), options)
}
