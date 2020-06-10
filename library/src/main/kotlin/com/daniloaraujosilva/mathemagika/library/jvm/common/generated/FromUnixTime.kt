package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FromUnixTime
 * 
 * Full name:        System`FromUnixTime
 * 
 * Usage:            FromUnixTime[time] gives a date object corresponding to a UnixTime specification.
 * 
 * Options:          TimeZone :> $TimeZone
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FromUnixTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromUnixTime.html
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
fun fromUnixTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromUnixTime", arguments.toMutableList(), options)
}
