package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeZone
 *
 * Full name:        System`TimeZone
 *
 * Usage:            TimeZone is an option for DateObject, DateString, and related functions that specifies the time zone to use for dates and times.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TimeZone
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeZone.html
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
fun timeZone(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeZone", arguments.toMutableList(), options)
}
