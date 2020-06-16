package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TimeObject
 *
 * Full name:        System`TimeObject
 *
 *                   TimeObject[] represents the current time.
 *                   TimeObject[{h, m, s}] represents a time object of standard normalized form.
 *                   TimeObject[date] gives the time component of the specified date representation.
 * Usage:            TimeObject[rtime, gran] gives the time object of granularity gran that includes the reference time rtime.
 *
 * Options:          TimeZone -> Automatic
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeObject.html
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
fun timeObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeObject", arguments.toMutableList(), options)
}
