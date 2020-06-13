package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PlotJoined
 *
 * Full name:        System`PlotJoined
 *
 * Usage:            PlotJoined is an option for ListPlot that specifies whether the points plotted should be joined by a line.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PlotJoined
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotJoined.html
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
fun plotJoined(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotJoined", arguments.toMutableList(), options)
}
