package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StreamPosition
 *
 * Full name:        System`StreamPosition
 *
 * Usage:            StreamPosition[stream] returns an integer that specifies the position of the current point in an open stream.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StreamPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamPosition.html
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
fun streamPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamPosition", arguments.toMutableList(), options)
}
