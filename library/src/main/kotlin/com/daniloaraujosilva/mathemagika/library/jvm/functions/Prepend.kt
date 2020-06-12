package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Prepend
 *
 * Full name:        System`Prepend
 *
 *                   Prepend[expr, elem] gives expr with elem prepended.
 * Usage:            Prepend[elem] represents an operator form of Prepend that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Prepend
 * Documentation:    web: http://reference.wolfram.com/language/ref/Prepend.html
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
fun prepend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Prepend", arguments.toMutableList(), options)
}
