package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Colon
 *
 * Full name:        System`Colon
 *
 * Usage:            Colon[x, y, …] displays as x ∶ y ∶ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Colon
 * Documentation:    web: http://reference.wolfram.com/language/ref/Colon.html
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
fun colon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Colon", arguments.toMutableList(), options)
}
