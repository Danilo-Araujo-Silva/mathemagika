package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cup
 *
 * Full name:        System`Cup
 *
 * Usage:            Cup[x, y, …] displays as x ⌣ y ⌣ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Cup
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cup.html
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
fun cup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cup", arguments.toMutableList(), options)
}
