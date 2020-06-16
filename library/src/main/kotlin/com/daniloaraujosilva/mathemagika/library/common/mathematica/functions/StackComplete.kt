package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StackComplete
 *
 * Full name:        System`StackComplete
 *
 * Usage:            StackComplete[expr] evaluates expr with intermediate expressions in evaluation chains included on the stack.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StackComplete
 * Documentation:    web: http://reference.wolfram.com/language/ref/StackComplete.html
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
fun stackComplete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StackComplete", arguments.toMutableList(), options)
}
