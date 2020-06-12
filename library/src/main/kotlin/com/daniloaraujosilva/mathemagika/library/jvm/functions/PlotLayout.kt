package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlotLayout
 *
 * Full name:        System`PlotLayout
 *
 * Usage:            PlotLayout is an option for plotting functions that specifies the layout of multiple components in a plot.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlotLayout
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotLayout.html
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
fun plotLayout(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotLayout", arguments.toMutableList(), options)
}
