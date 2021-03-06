package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Compose
 *
 * Full name:        System`Compose
 *
 * Usage:            System`Compose
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Compose
 * Documentation:    web: http://reference.wolfram.com/language/ref/Compose.html
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
fun compose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Compose", arguments.toMutableList(), options)
}
