package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             False
 *
 * Full name:        System`False
 *
 * Usage:            False is the symbol for the Boolean value false.
 *
 * Options:          None
 *
 *                   Locked
 * Attributes:       Protected
 *
 *                   local: paclet:ref/False
 * Documentation:    web: http://reference.wolfram.com/language/ref/False.html
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
fun `false`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("False", arguments.toMutableList(), options)
}
