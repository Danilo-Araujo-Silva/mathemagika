package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlotRegion
 *
 * Full name:        System`PlotRegion
 *
 * Usage:            PlotRegion is an option for graphics functions that specifies what region of the final display area a plot should fill.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PlotRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotRegion.html
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
fun plotRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotRegion", arguments.toMutableList(), options)
}
