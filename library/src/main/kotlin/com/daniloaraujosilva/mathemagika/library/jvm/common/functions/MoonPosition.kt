package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MoonPosition
 *
 * Full name:        System`MoonPosition
 *
 *                   MoonPosition[] gives the position of the Moon for the current date and location.
 *                   MoonPosition[datespec] gives the position of the Moon for the specified date.
 *                   MoonPosition[locationspec] gives the position of the Moon for the specified location.
 *                   MoonPosition[locationspec, datespec] gives the position of the Moon for the specified date and location.
 *                   MoonPosition[{{location , date }, {location , date }, …}] gives the positions of the Moon for all specified locations on the specified dates.
 *                                          1      1            2      2
 * Usage:            MoonPosition[locationspec, datespec, func] uses func to determine what to return for extended locations.
 *
 *                   AltitudeMethod -> TrueAltitude
 * Options:          CelestialSystem -> Horizon
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoonPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoonPosition.html
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
fun moonPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoonPosition", arguments.toMutableList(), options)
}
