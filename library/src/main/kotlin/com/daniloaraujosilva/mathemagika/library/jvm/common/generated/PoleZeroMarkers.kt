package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PoleZeroMarkers
 * 
 * Full name:        System`PoleZeroMarkers
 * 
 * Usage:            PoleZeroMarkers is an option for RootLocusPlot that specifies the markers to be drawn on the complex plane at the open-loop poles, closed-loop poles, and open-loop zeros.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PoleZeroMarkers
 * Documentation:    web: http://reference.wolfram.com/language/ref/PoleZeroMarkers.html
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
fun poleZeroMarkers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PoleZeroMarkers", arguments.toMutableList(), options)
}
