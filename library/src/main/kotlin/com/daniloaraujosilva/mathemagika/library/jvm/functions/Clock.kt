package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Clock
 *
 * Full name:        System`Clock
 *
 *                   Clock[] represents a clock variable whose value cycles continuously from 0 to 1 once per second when it appears inside a dynamically updated object such as a Dynamic.
 *                   Clock[t] cycles from 0 to t every t seconds.
 *                   Clock[v   , t] cycles from 0 to v    every t seconds.
 *                          max                       max
 *                   Clock[{v   , v   }, t] cycles through the range v    to v    every t seconds.
 *                           min   max                                min     max
 *                   Clock[{v   , v   }] cycles through the range v    to v    over the course of v    - v    seconds.
 *                           min   max                             min     max                     max    min
 *                   Clock[{v   , v   , dv}] cycles from v    to v    in steps of dv, spending dv seconds at each value.
 *                           min   max                    min     max
 *                   Clock[{v   , v   , dv}, t] cycles from v    to v    in steps dv every t seconds.
 *                           min   max                       min     max
 * Usage:            Clock[vals, t, n] goes through the cycle only n times, then always yields only the maximum value.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Clock
 * Documentation:    web: http://reference.wolfram.com/language/ref/Clock.html
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
fun clock(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Clock", arguments.toMutableList(), options)
}
