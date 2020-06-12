package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoCenter
 *
 * Full name:        System`GeoCenter
 *
 * Usage:            GeoCenter is an option for GeoGraphics that specifies the coordinates of the point that should appear at the geographic center of the final map.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoCenter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoCenter.html
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
fun geoCenter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoCenter", arguments.toMutableList(), options)
}
