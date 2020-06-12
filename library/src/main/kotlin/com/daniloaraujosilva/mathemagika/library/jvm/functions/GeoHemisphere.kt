package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoHemisphere
 *
 * Full name:        System`GeoHemisphere
 *
 *                   GeoHemisphere[] is a two-dimensional GeoGraphics primitive that represents the half of the Earth centered at your current geo location.
 * Usage:            GeoHemisphere[loc] represents the half of the Earth centered at the location loc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoHemisphere
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoHemisphere.html
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
fun geoHemisphere(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoHemisphere", arguments.toMutableList(), options)
}
