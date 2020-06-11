package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WriteLine
 *
 * Full name:        System`WriteLine
 *
 *                   WriteLine[stream, "string"] writes "string", followed by a newline, to the specified output stream.
 * Usage:            WriteLine[proc, "string"] writes "string" to an external process proc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WriteLine
 * Documentation:    web: http://reference.wolfram.com/language/ref/WriteLine.html
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
fun writeLine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WriteLine", arguments.toMutableList(), options)
}
