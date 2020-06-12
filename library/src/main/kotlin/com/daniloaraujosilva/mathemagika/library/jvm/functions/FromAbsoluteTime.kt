package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FromAbsoluteTime
 *
 * Full name:        System`FromAbsoluteTime
 *
 * Usage:            FromAbsoluteTime[time] gives a date object corresponding to an absolute time specification as given by AbsoluteTime.
 *
 *                   DateDelimiters -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FromAbsoluteTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromAbsoluteTime.html
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
fun fromAbsoluteTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromAbsoluteTime", arguments.toMutableList(), options)
}
