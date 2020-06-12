package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoScaleBar
 *
 * Full name:        System`GeoScaleBar
 *
 * Usage:            GeoScaleBar is an option for GeoGraphics that determines what scale to show on the map.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoScaleBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoScaleBar.html
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
fun geoScaleBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoScaleBar", arguments.toMutableList(), options)
}
