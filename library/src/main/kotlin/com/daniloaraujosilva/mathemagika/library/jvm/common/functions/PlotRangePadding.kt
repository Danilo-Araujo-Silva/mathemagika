package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PlotRangePadding
 *
 * Full name:        System`PlotRangePadding
 *
 * Usage:            PlotRangePadding is an option for graphics functions that specifies how much further axes etc. should extend beyond the range of coordinates specified by PlotRange.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PlotRangePadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotRangePadding.html
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
fun plotRangePadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotRangePadding", arguments.toMutableList(), options)
}
