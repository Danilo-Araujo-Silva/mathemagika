package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AsynchronousTasks
 *
 * Full name:        System`AsynchronousTasks
 *
 * Usage:            AsynchronousTasks[] returns a list of running asynchronous tasks.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AsynchronousTasks
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsynchronousTasks.html
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
fun asynchronousTasks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsynchronousTasks", arguments.toMutableList(), options)
}
