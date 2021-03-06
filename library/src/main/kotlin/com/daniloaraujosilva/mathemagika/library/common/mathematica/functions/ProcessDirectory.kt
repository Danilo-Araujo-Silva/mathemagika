package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessDirectory
 *
 * Full name:        System`ProcessDirectory
 *
 * Usage:            ProcessDirectory is an option specifying the initial working directory to use when executing a process in functions like StartProcess and RunProcess.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ProcessDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessDirectory.html
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
fun processDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessDirectory", arguments.toMutableList(), options)
}
