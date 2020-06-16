package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExtentMarkers
 *
 * Full name:        System`ExtentMarkers
 *
 * Usage:            ExtentMarkers is an option to DiscretePlot and DiscretePlot3D that specifies markers to draw at extent boundaries.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExtentMarkers
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExtentMarkers.html
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
fun extentMarkers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExtentMarkers", arguments.toMutableList(), options)
}
