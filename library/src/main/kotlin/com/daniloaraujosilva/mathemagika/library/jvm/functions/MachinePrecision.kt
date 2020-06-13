package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MachinePrecision
 *
 * Full name:        System`MachinePrecision
 *
 * Usage:            MachinePrecision is a symbol used to indicate machine‐number precision.
 *
 * Options:          None
 *
 *                   Constant
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MachinePrecision
 * Documentation:    web: http://reference.wolfram.com/language/ref/MachinePrecision.html
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
fun machinePrecision(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MachinePrecision", arguments.toMutableList(), options)
}
