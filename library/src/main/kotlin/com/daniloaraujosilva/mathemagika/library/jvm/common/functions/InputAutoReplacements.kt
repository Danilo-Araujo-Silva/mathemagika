package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InputAutoReplacements
 *
 * Full name:        System`InputAutoReplacements
 *
 * Usage:            InputAutoReplacements is an option for cells and notebooks which specifies strings of characters that should be replaced immediately on input.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InputAutoReplacements
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputAutoReplacements.html
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
fun inputAutoReplacements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputAutoReplacements", arguments.toMutableList(), options)
}
