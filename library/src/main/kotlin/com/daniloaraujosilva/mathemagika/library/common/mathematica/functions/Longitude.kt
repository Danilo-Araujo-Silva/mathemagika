package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Longitude
 *
 * Full name:        System`Longitude
 *
 *                   Longitude[pos] gives the longitude in degrees of a geographic position specified by pos.
 * Usage:            Longitude[pos, datum] gives the longitude referring to the specified geodetic datum.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Longitude
 * Documentation:    web: http://reference.wolfram.com/language/ref/Longitude.html
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
fun longitude(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Longitude", arguments.toMutableList(), options)
}
