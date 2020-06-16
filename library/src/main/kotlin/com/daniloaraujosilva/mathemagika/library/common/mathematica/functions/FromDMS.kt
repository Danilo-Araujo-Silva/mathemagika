package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FromDMS
 *
 * Full name:        System`FromDMS
 *
 *                   FromDMS[{d, m, s}] converts from degrees, minutes, and seconds to decimal degrees.
 *                   FromDMS["dms"] converts from a DMS string to decimal degrees.
 * Usage:            FromDMS["latlon"] converts from a latitude-longitude string to latitude and longitude in decimal degrees.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FromDMS
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromDMS.html
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
fun fromDMS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromDMS", arguments.toMutableList(), options)
}
