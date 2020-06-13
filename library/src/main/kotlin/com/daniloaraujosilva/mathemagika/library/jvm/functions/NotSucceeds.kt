package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotSucceeds
 *
 * Full name:        System`NotSucceeds
 *
 * Usage:            NotSucceeds[x, y, …] displays as x ⊁ y ⊁ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSucceeds
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSucceeds.html
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
fun notSucceeds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSucceeds", arguments.toMutableList(), options)
}
