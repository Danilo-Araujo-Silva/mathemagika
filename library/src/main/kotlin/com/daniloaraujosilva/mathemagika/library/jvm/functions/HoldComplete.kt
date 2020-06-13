package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HoldComplete
 *
 * Full name:        System`HoldComplete
 *
 * Usage:            HoldComplete[expr] shields expr completely from the standard Wolfram Language evaluation process, preventing even upvalues associated with expr from being used.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HoldComplete
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoldComplete.html
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
fun holdComplete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoldComplete", arguments.toMutableList(), options)
}
