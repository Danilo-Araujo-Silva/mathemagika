package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AcceptanceThreshold
 *
 * Full name:        System`AcceptanceThreshold
 *
 * Usage:            AcceptanceThreshold is an option that specifies the minimum threshold at which a result is considered acceptable.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AcceptanceThreshold
 * Documentation:    web: http://reference.wolfram.com/language/ref/AcceptanceThreshold.html
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
fun acceptanceThreshold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AcceptanceThreshold", arguments.toMutableList(), options)
}
