package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SucceedsSlantEqual
 *
 * Full name:        System`SucceedsSlantEqual
 *
 * Usage:            SucceedsSlantEqual[x, y, …] displays as x ≽ y ≽ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SucceedsSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/SucceedsSlantEqual.html
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
fun succeedsSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SucceedsSlantEqual", arguments.toMutableList(), options)
}
