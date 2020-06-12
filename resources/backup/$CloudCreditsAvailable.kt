package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Indeterminate
 *
 * Full name:        System`Indeterminate
 *
 * Usage:            Indeterminate is a symbol that represents a numerical quantity whose magnitude cannot be determined.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Indeterminate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Indeterminate.html
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
fun `$CloudCreditsAvailable`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$CloudCreditsAvailable", arguments.toMutableList(), options)
}
