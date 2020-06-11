package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlotTheme
 *
 * Full name:        System`PlotTheme
 *
 * Usage:            PlotTheme is an option for plotting and related functions that specifies an overall theme for visualization elements and styles.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PlotTheme
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotTheme.html
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
fun plotTheme(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotTheme", arguments.toMutableList(), options)
}
