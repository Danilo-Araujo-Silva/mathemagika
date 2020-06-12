package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindGeoLocation
 *
 * Full name:        System`FindGeoLocation
 *
 *                   FindGeoLocation[] attempts to find the current geo location of your computer.
 *                   FindGeoLocation["ip"] gives an estimate of the geo location associated with the IP address given.
 *                   FindGeoLocation["address"] attempts to find the geo location associated with the street address given.
 * Usage:            FindGeoLocation[entity] gives the geo location associated with the specified entity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindGeoLocation
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindGeoLocation.html
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
fun findGeoLocation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindGeoLocation", arguments.toMutableList(), options)
}
