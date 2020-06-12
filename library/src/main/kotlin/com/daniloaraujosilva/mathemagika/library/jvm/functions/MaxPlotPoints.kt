package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxPlotPoints
 *
 * Full name:        System`MaxPlotPoints
 *
 * Usage:            MaxPlotPoints is an option for plotting functions like ArrayPlot and ListPlot3D that specifies the maximum number of points that will explicitly be included in the output.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxPlotPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxPlotPoints.html
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
fun maxPlotPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxPlotPoints", arguments.toMutableList(), options)
}
