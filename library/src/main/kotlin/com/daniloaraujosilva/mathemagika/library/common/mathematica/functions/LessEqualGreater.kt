package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LessEqualGreater
 *
 * Full name:        System`LessEqualGreater
 *
 * Usage:            LessEqualGreater[x, y, …] displays as x ⋚ y ⋚ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LessEqualGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessEqualGreater.html
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
fun lessEqualGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessEqualGreater", arguments.toMutableList(), options)
}
