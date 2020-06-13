package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeoDisplacement
 *
 * Full name:        System`GeoDisplacement
 *
 *                   GeoDisplacement[{dist, α}] represents a geodesic displacement of length dist and initial bearing α from a geo location.
 *                   GeoDisplacement[{dist, α}, pathtype] represents a displacement of length dist and initial bearing α along a path of type pathtype.
 *                   GeoDisplacement[loc , loc , pathtype] returns the displacement needed to reach loc  from loc  along a path of type pathtype.
 * Usage:                               1     2                                                        2         1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoDisplacement
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDisplacement.html
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
fun geoDisplacement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDisplacement", arguments.toMutableList(), options)
}
