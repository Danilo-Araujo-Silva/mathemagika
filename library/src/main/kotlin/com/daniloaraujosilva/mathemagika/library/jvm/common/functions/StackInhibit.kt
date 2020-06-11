package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StackInhibit
 *
 * Full name:        System`StackInhibit
 *
 * Usage:            StackInhibit[expr] evaluates expr without modifying the evaluation stack.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StackInhibit
 * Documentation:    web: http://reference.wolfram.com/language/ref/StackInhibit.html
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
fun stackInhibit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StackInhibit", arguments.toMutableList(), options)
}
