package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AskConfirm
 *
 * Full name:        System`AskConfirm
 *
 *                   AskConfirm["key"] is a construct for use inside AskFunction that asks for confirmation of the current value associated with "key" and allows this to be either confirmed or changed.
 *                   AskConfirm["key", fun] applies the function fun to determine how to ask for confirmation.
 * Usage:            AskConfirm["key", "str"] applies the string "str" as a string template to ask for confirmation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AskConfirm
 * Documentation:    web: http://reference.wolfram.com/language/ref/AskConfirm.html
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
fun askConfirm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AskConfirm", arguments.toMutableList(), options)
}
