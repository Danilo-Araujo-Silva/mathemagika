package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EndOfBuffer
 *
 * Full name:        System`EndOfBuffer
 *
 * Usage:            EndOfBuffer is a symbol that represents the end of currently available data in the buffer for a process or stream.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/EndOfBuffer
 * Documentation:    web: http://reference.wolfram.com/language/ref/EndOfBuffer.html
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
fun endOfBuffer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EndOfBuffer", arguments.toMutableList(), options)
}
