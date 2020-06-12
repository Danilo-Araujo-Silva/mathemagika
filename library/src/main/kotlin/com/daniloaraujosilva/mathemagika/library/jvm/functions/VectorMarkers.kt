package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VectorMarkers
 *
 * Full name:        System`VectorMarkers
 *
 * Usage:            VectorMarkers is an option for graphics functions like VectorPlot, ListVectorPlot and related functions that specifies what markers to draw at the field points plotted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorMarkers
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorMarkers.html
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
fun vectorMarkers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorMarkers", arguments.toMutableList(), options)
}
