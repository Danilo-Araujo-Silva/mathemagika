package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PingTime
 *
 * Full name:        System`PingTime
 *
 *                   PingTime[host] gives the round-trip ping time for the specified network host.
 * Usage:            PingTime[host, n] gives a list of times for n successive pings.
 *
 *                   TimeConstraint -> Automatic
 * Options:          UpdateInterval -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PingTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/PingTime.html
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
fun pingTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PingTime", arguments.toMutableList(), options)
}
