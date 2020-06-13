package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UpArrowBar
 *
 * Full name:        System`UpArrowBar
 *
 * Usage:            UpArrowBar[x, y, …] displays as x ⤒ y ⤒ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpArrowBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpArrowBar.html
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
fun upArrowBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpArrowBar", arguments.toMutableList(), options)
}