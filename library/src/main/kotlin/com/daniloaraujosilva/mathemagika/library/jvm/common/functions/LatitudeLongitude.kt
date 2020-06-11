package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LatitudeLongitude
 *
 * Full name:        System`LatitudeLongitude
 *
 *                   LatitudeLongitude[pos] gives a list of the latitude and longitude in degrees of a geographic position specified by pos.
 * Usage:            LatitudeLongitude[pos, datum] gives the latitude and longitude referring to the specified geodetic datum.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LatitudeLongitude
 * Documentation:    web: http://reference.wolfram.com/language/ref/LatitudeLongitude.html
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
fun latitudeLongitude(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LatitudeLongitude", arguments.toMutableList(), options)
}
