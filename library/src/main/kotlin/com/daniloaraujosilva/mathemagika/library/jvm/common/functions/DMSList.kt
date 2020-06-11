package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DMSList
 *
 * Full name:        System`DMSList
 *
 *                   DMSList[θ] converts an angle θ given in decimal degrees to a DMS list {degree, minute, second}.
 *                   DMSList["dms"] converts a DMS string to a DMS list {degree, minute, second}.
 *                   DMSList["latlon"] converts a latitude-longitude string to a pair of DMS lists.
 * Usage:            DMSList[GeoPosition[…]] converts GeoPosition data to a pair or array of pairs of DMS lists.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DMSList
 * Documentation:    web: http://reference.wolfram.com/language/ref/DMSList.html
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
fun dMSList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DMSList", arguments.toMutableList(), options)
}
