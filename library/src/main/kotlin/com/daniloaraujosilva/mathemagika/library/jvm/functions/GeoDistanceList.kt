package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoDistanceList
 *
 * Full name:        System`GeoDistanceList
 *
 *                   GeoDistanceList[{loc , loc , …, loc }] returns the list of geodesic distances between consecutive pairs of locations.
 * Usage:                                1     2        n
 *
 *                   DistanceFunction -> Center
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoDistanceList
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDistanceList.html
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
fun geoDistanceList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDistanceList", arguments.toMutableList(), options)
}
