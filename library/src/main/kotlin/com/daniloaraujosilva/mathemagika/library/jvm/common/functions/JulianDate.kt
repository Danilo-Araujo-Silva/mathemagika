package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JulianDate
 *
 * Full name:        System`JulianDate
 *
 *                   JulianDate[] gives the current number of days since noon on November 24, 4714 BCE in the GMT time zone.
 *                   JulianDate[date] gives the number of days for the specified date.
 *                   JulianDate["type"] gives the Julian date variant of the specified type.
 * Usage:            JulianDate["type", date] gives the variant for the specified date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JulianDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/JulianDate.html
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
fun julianDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JulianDate", arguments.toMutableList(), options)
}
