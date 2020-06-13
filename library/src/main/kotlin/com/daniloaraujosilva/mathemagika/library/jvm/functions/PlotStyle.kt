package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PlotStyle
 *
 * Full name:        System`PlotStyle
 *
 * Usage:            PlotStyle is an option for plotting and related functions that specifies styles in which objects are to be drawn.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PlotStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotStyle.html
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
fun plotStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotStyle", arguments.toMutableList(), options)
}
