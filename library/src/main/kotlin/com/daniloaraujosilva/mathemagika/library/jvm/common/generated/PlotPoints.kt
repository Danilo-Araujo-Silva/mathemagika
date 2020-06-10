package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PlotPoints
 * 
 * Full name:        System`PlotPoints
 * 
 * Usage:            PlotPoints is an option for plotting functions that specifies how many initial sample points to use. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PlotPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/PlotPoints.html
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
fun plotPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PlotPoints", arguments.toMutableList(), options)
}
