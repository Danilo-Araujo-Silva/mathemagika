package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SetStreamPosition
 *
 * Full name:        System`SetStreamPosition
 *
 * Usage:            SetStreamPosition[stream, n] sets the current point in an open stream.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SetStreamPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetStreamPosition.html
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
fun setStreamPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetStreamPosition", arguments.toMutableList(), options)
}
