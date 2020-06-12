package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WriteString
 *
 * Full name:        System`WriteString
 *
 *                   WriteString["file", "string"] writes "string" to a file.
 *                   WriteString[channel, "string"] writes "string" to a stream or process.
 *                   WriteString[channel, expr , expr , …] converts the expr  to strings, and then writes them in sequence to the specified output channel.
 * Usage:                                     1      2                      i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WriteString
 * Documentation:    web: http://reference.wolfram.com/language/ref/WriteString.html
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
fun writeString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WriteString", arguments.toMutableList(), options)
}
