package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeoDistance
 *
 * Full name:        System`GeoDistance
 *
 *                   GeoDistance[{lat , lon }, {lat , lon }] gives the geodesic distance between latitude-longitude positions on the Earth.
 *                                   1     1       2     2
 *                   GeoDistance[loc , loc ] gives the distance between locations specified by position objects or geographical entities.
 *                                  1     2
 *                   GeoDistance[{loc , …, loc }] gives the total distance from loc  to loc  through all the intermediate loc .
 * Usage:                            1        n                                    1       n                                 i
 *
 *                   DistanceFunction -> Boundary
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDistance.html
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
fun geoDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDistance", arguments.toMutableList(), options)
}
