package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LeftArrowBar
 *
 * Full name:        System`LeftArrowBar
 *
 * Usage:            LeftArrowBar[x, y, …] displays as x ⇤ y ⇤ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftArrowBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftArrowBar.html
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
fun leftArrowBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftArrowBar", arguments.toMutableList(), options)
}
