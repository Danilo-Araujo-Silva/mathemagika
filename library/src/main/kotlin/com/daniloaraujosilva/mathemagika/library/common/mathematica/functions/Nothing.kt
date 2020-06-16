package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:
 *
 * Full name:        System`Nothing
 *
 *                   Nothing represents an element of a list that will automatically be removed.
 * Usage:            Nothing[…] gives Nothing.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Nothing
 * Documentation:    web: http://reference.wolfram.com/language/ref/Nothing.html
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
fun nothing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Nothing", arguments.toMutableList(), options)
}
