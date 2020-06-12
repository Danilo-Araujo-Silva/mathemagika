package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Streams
 *
 * Full name:        System`Streams
 *
 *                   Streams[] gives a list of all streams that are currently open.
 * Usage:            Streams["name"] lists only streams with the specified name.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Streams
 * Documentation:    web: http://reference.wolfram.com/language/ref/Streams.html
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
fun streams(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Streams", arguments.toMutableList(), options)
}
