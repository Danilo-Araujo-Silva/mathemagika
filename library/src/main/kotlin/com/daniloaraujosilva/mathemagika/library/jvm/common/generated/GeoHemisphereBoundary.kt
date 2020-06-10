package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoHemisphereBoundary
 * 
 * Full name:        System`GeoHemisphereBoundary
 * 
 *                   GeoHemisphereBoundary[] is a one-dimensional GeoGraphics primitive that represents the boundary line of a hemisphere of the Earth centered at the current geo location.
 * Usage:            GeoHemisphereBoundary[loc] represents the boundary line of a hemisphere centered at the location loc.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoHemisphereBoundary
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoHemisphereBoundary.html
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
fun geoHemisphereBoundary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoHemisphereBoundary", arguments.toMutableList(), options)
}
