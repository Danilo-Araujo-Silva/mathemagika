package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StreamMarkers
 *
 * Full name:        System`StreamMarkers
 *
 * Usage:            StreamMarkers is an option for StreamPlot, ListStreamPlot and related functions that specifies what markers to draw at the field points plotted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StreamMarkers
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamMarkers.html
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
fun streamMarkers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamMarkers", arguments.toMutableList(), options)
}
