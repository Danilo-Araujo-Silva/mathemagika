package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GaugeMarkers
 *
 * Full name:        System`GaugeMarkers
 *
 * Usage:            GaugeMarkers is an option for gauge functions that specifies what markers to draw to mark the values.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GaugeMarkers
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaugeMarkers.html
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
fun gaugeMarkers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaugeMarkers", arguments.toMutableList(), options)
}
