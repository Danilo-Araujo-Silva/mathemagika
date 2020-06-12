package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SmallCircle
 *
 * Full name:        System`SmallCircle
 *
 * Usage:            SmallCircle[x, y, …] displays as x ∘ y ∘ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SmallCircle
 * Documentation:    web: http://reference.wolfram.com/language/ref/SmallCircle.html
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
fun smallCircle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SmallCircle", arguments.toMutableList(), options)
}
