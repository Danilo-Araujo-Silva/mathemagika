package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrecedesTilde
 *
 * Full name:        System`PrecedesTilde
 *
 * Usage:            PrecedesTilde[x, y, …] displays as x ≾ y ≾ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/PrecedesTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrecedesTilde.html
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
fun precedesTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrecedesTilde", arguments.toMutableList(), options)
}
