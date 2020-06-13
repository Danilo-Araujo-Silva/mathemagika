package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HoldFirst
 *
 * Full name:        System`HoldFirst
 *
 * Usage:            HoldFirst is an attribute that specifies that the first argument to a function is to be maintained in an unevaluated form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HoldFirst
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoldFirst.html
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
fun holdFirst(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoldFirst", arguments.toMutableList(), options)
}
