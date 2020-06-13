package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FromJulianDate
 *
 * Full name:        System`FromJulianDate
 *
 *                   FromJulianDate[jd] gives a date object corresponding to the Julian date jd.
 * Usage:            FromJulianDate["type", jd] gives a date object corresponding to the specified Julian date variant.
 *
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FromJulianDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromJulianDate.html
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
fun fromJulianDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromJulianDate", arguments.toMutableList(), options)
}
