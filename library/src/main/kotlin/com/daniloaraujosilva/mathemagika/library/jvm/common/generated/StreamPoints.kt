package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StreamPoints
 * 
 * Full name:        System`StreamPoints
 * 
 * Usage:            StreamPoints is an option to StreamPlot, ListStreamPlot, and related functions that determines how many streamlines to draw.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StreamPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamPoints.html
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
fun streamPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamPoints", arguments.toMutableList(), options)
}
