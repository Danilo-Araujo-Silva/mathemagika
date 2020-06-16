package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessEnvironment
 *
 * Full name:        System`ProcessEnvironment
 *
 * Usage:            ProcessEnvironment is an option specifying the initial settings of environment variables to use when executing a process in functions like StartProcess and RunProcess.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ProcessEnvironment
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessEnvironment.html
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
fun processEnvironment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessEnvironment", arguments.toMutableList(), options)
}
