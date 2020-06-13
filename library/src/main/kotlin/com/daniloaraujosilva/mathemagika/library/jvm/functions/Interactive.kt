package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Interactive
 *
 * Full name:        System`Interactive
 *
 * Usage:            Interactive is an option that specifies whether a function should create a user prompt when mimicking an action that would have created a user prompt if invoked manually.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Interactive
 * Documentation:    web: http://reference.wolfram.com/language/ref/Interactive.html
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
fun interactive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Interactive", arguments.toMutableList(), options)
}
