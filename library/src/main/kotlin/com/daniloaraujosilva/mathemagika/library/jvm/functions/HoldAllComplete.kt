package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HoldAllComplete
 *
 * Full name:        System`HoldAllComplete
 *
 * Usage:            HoldAllComplete is an attribute which specifies that all arguments to a function are not to be modified or looked at in any way in the process of evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HoldAllComplete
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoldAllComplete.html
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
fun holdAllComplete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoldAllComplete", arguments.toMutableList(), options)
}
