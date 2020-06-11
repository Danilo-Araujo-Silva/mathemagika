package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetEnvironment
 *
 * Full name:        System`SetEnvironment
 *
 *                   SetEnvironment["var"  value] sets the value of an operating system environment variable.
 * Usage:            SetEnvironment[{"var"  value, …}] sets values for several environment variables.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetEnvironment
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetEnvironment.html
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
fun setEnvironment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetEnvironment", arguments.toMutableList(), options)
}
