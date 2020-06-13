package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RunThrough
 *
 * Full name:        System`RunThrough
 *
 * Usage:            RunThrough["command", expr] executes an external command, giving the printed form of expr as input and taking the output, reading it as Wolfram Language input, and returning the result.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RunThrough
 * Documentation:    web: http://reference.wolfram.com/language/ref/RunThrough.html
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
fun runThrough(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RunThrough", arguments.toMutableList(), options)
}
