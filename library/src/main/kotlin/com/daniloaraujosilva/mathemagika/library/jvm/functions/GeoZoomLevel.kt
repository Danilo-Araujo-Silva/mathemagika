package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoZoomLevel
 *
 * Full name:        System`GeoZoomLevel
 *
 * Usage:            GeoZoomLevel is an option for specifying the resolution at which to render a map.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoZoomLevel
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoZoomLevel.html
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
fun geoZoomLevel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoZoomLevel", arguments.toMutableList(), options)
}
