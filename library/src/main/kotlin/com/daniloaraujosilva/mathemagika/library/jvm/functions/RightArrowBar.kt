package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RightArrowBar
 *
 * Full name:        System`RightArrowBar
 *
 * Usage:            RightArrowBar[x, y, …] displays as x ⇥ y ⇥ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightArrowBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightArrowBar.html
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
fun rightArrowBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightArrowBar", arguments.toMutableList(), options)
}
