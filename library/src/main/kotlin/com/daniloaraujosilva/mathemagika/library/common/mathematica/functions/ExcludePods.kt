package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExcludePods
 *
 * Full name:        System`ExcludePods
 *
 * Usage:            ExcludePods is an option to WolframAlpha that specifies pod IDs to exclude from the results.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExcludePods
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExcludePods.html
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
fun excludePods(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExcludePods", arguments.toMutableList(), options)
}
