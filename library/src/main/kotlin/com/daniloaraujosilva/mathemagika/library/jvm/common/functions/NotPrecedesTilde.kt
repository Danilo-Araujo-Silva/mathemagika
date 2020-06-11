package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotPrecedesTilde
 *
 * Full name:        System`NotPrecedesTilde
 *
 * Usage:            NotPrecedesTilde[x, y, …] displays as x ⋨ y ⋨ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotPrecedesTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotPrecedesTilde.html
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
fun notPrecedesTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotPrecedesTilde", arguments.toMutableList(), options)
}
