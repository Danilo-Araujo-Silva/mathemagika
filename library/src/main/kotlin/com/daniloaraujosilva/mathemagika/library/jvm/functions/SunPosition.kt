package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SunPosition
 *
 * Full name:        System`SunPosition
 *
 *                   SunPosition[] gives the position of the Sun for the current date and location.
 *                   SunPosition[datespec] gives the position of the Sun for the specified date.
 *                   SunPosition[locationspec] gives the positions of the Sun for the specified location.
 *                   SunPosition[locationspec, datespec] gives the position of the Sun for the specified date and location.
 *                   SunPosition[{{location , date }, {location , date }, …}] gives the positions of the Sun for all specified locations on the specified dates.
 *                                         1      1            2      2
 * Usage:            SunPosition[locationspec, datespec, func] uses func to determine what to return for extended locations.
 *
 *                   AltitudeMethod -> TrueAltitude
 * Options:          CelestialSystem -> Horizon
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SunPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SunPosition.html
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
fun sunPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SunPosition", arguments.toMutableList(), options)
}
