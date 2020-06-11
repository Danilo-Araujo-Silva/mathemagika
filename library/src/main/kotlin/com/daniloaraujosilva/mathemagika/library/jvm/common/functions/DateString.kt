package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DateString
 *
 * Full name:        System`DateString
 *
 *                   DateString[] gives a string representing the complete current local date and time.
 *                   DateString["elem"] gives the specified element or format for date and time.
 *                   DateString[{"elem ", "elem ", …}] concatenates the specified elements in the order given.
 *                                    1        2
 *                   DateString[{y, m, d, h, m, s}] gives a string corresponding to a DateList specification.
 *                   DateString[time] gives a string corresponding to an AbsoluteTime specification.
 *                   DateString[date] gives a string corresponding to a DateObject specification.
 * Usage:            DateString[spec, elems] gives elements elems of the date or time specification spec.
 *
 *                   DateDelimiters -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateString
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateString.html
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
fun dateString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateString", arguments.toMutableList(), options)
}
