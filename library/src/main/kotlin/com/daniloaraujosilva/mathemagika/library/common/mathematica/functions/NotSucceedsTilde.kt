package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotSucceedsTilde
 *
 * Full name:        System`NotSucceedsTilde
 *
 * Usage:            NotSucceedsTilde[x, y, …] displays as x ⋩ y ⋩ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSucceedsTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSucceedsTilde.html
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
fun notSucceedsTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSucceedsTilde", arguments.toMutableList(), options)
}
