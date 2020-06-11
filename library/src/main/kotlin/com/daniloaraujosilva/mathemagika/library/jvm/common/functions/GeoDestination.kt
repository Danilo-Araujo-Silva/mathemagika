package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoDestination
 *
 * Full name:        System`GeoDestination
 *
 * Usage:            GeoDestination[loc, {d, α}] gives the end position of the geodesic of length d starting from loc with azimuthal direction α.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoDestination
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDestination.html
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
fun geoDestination(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDestination", arguments.toMutableList(), options)
}
