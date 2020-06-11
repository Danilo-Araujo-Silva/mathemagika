package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StreamScale
 *
 * Full name:        System`StreamScale
 *
 * Usage:            StreamScale is an option to StreamPlot, ListStreamPlot, and related functions that determines the length and arrowhead size of streamlines that are drawn.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StreamScale
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamScale.html
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
fun streamScale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamScale", arguments.toMutableList(), options)
}
