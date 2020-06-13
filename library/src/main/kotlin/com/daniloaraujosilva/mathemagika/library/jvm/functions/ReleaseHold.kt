package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ReleaseHold
 *
 * Full name:        System`ReleaseHold
 *
 * Usage:            ReleaseHold[expr] removes Hold, HoldForm, HoldPattern, and HoldComplete in expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReleaseHold
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReleaseHold.html
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
fun releaseHold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReleaseHold", arguments.toMutableList(), options)
}
