package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LessGreater
 *
 * Full name:        System`LessGreater
 *
 * Usage:            LessGreater[x, y, …] displays as x ≶ y ≶ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LessGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessGreater.html
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
fun lessGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessGreater", arguments.toMutableList(), options)
}
