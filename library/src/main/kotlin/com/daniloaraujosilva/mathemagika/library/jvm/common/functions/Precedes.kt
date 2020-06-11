package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Precedes
 *
 * Full name:        System`Precedes
 *
 * Usage:            Precedes[x, y, …] displays as x ≺ y ≺ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Precedes
 * Documentation:    web: http://reference.wolfram.com/language/ref/Precedes.html
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
fun precedes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Precedes", arguments.toMutableList(), options)
}
