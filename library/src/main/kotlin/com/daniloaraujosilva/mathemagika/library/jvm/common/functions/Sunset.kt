package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Sunset
 *
 * Full name:        System`Sunset
 *
 *                   Sunset[] gives the time of the next sunset for the current date and location.
 *                   Sunset[datespec] gives the time of the next sunset for the specified dates.
 *                   Sunset[locationspec] gives the times of the next sunset for the specified locations.
 *                   Sunset[locationspec, datespec] gives the time of the next sunset for the specified date and location.
 *                   Sunset[{{location , date }, {location , date }, …}] gives the times of the next sunset for all specified locations on the specified dates.
 *                                    1      1            2      2
 * Usage:            Sunset[locationspec, datespec, func] uses func to determine what to return for extended locations.
 *
 *                   TimeDirection :> 1
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sunset
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sunset.html
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
fun sunset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sunset", arguments.toMutableList(), options)
}
