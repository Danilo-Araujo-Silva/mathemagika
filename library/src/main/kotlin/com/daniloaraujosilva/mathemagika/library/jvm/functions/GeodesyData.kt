package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeodesyData
 *
 * Full name:        System`GeodesyData
 *
 *                   GeodesyData["name", "property"] gives the value of the specified property for a named geodetic datum or reference ellipsoid.
 *                   GeodesyData[{a, b}, "property"] gives the value of the property for the ellipsoid with semimajor axis a and semiminor axis b.
 * Usage:            GeodesyData[obj, {"property", coords}] gives the value of the property at the specified coordinates.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeodesyData
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeodesyData.html
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
fun geodesyData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeodesyData", arguments.toMutableList(), options)
}
