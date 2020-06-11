package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InputAliases
 *
 * Full name:        System`InputAliases
 *
 * Usage:            InputAliases is an option for cells and notebooks which specifies additional Esc name Esc aliases to be allowed on input.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InputAliases
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputAliases.html
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
fun inputAliases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputAliases", arguments.toMutableList(), options)
}
