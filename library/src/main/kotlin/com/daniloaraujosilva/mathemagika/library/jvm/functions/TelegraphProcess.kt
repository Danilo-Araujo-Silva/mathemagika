package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TelegraphProcess
 *
 * Full name:        System`TelegraphProcess
 *
 * Usage:            TelegraphProcess[μ] represents a telegraph process with rate μ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TelegraphProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/TelegraphProcess.html
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
fun telegraphProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TelegraphProcess", arguments.toMutableList(), options)
}
