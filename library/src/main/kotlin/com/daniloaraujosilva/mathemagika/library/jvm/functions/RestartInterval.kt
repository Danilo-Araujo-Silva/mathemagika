package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RestartInterval
 *
 * Full name:        System`RestartInterval
 *
 * Usage:            RestartInterval is an option controlling the restart behavior of functions such as ContinuousTask.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RestartInterval
 * Documentation:    web: http://reference.wolfram.com/language/ref/RestartInterval.html
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
fun restartInterval(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RestartInterval", arguments.toMutableList(), options)
}
