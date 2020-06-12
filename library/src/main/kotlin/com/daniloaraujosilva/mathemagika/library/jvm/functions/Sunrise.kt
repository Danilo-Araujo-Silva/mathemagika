package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Sunrise
 *
 * Full name:        System`Sunrise
 *
 *                   Sunrise[] gives the time of the next sunrise for the current date and location.
 *                   Sunrise[datespec] gives the times of the next sunrise for the specified dates.
 *                   Sunrise[locationspec] gives the times of the next sunrise for the specified locations.
 *                   Sunrise[locationspec, datespec] gives the time of the next sunrise for the specified date and location.
 *                   Sunrise[{{location , date }, {location , date }, …}] gives the times of the next sunrise for all specified locations on the specified dates.
 *                                     1      1            2      2
 * Usage:            Sunrise[locationspec, datespec, func] uses func to determine what to return for extended locations.
 *
 *                   TimeDirection :> 1
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sunrise
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sunrise.html
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
fun sunrise(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sunrise", arguments.toMutableList(), options)
}
