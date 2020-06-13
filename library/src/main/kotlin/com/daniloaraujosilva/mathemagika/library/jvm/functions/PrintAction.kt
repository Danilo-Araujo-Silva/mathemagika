package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrintAction
 *
 * Full name:        System`PrintAction
 *
 * Usage:            PrintAction is an option for notebooks that specifies the action taken when a Print[] command is evaluated by the kernel.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrintAction
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrintAction.html
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
fun printAction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrintAction", arguments.toMutableList(), options)
}
