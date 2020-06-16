package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SessionTime
 *
 * Full name:        System`SessionTime
 *
 * Usage:            SessionTime[] gives the total number of seconds of real time that have elapsed since the beginning of your Wolfram System session.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SessionTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/SessionTime.html
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
fun sessionTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SessionTime", arguments.toMutableList(), options)
}
