package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeaderSize
 *
 * Full name:        System`LeaderSize
 *
 * Usage:            LeaderSize is an option for Callout that specifies what sizes to use for leader lines.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LeaderSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeaderSize.html
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
fun leaderSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeaderSize", arguments.toMutableList(), options)
}
