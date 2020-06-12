package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $TimedOut
 *
 * Full name:        System`$TimedOut
 *
 * Usage:            $TimedOut is a special symbol returned by certain functions when an operation times out.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/$TimedOut
 * Documentation:    web: http://reference.wolfram.com/language/ref/$TimedOut.html
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
fun `$TimedOut`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$TimedOut", arguments.toMutableList(), options)
}
