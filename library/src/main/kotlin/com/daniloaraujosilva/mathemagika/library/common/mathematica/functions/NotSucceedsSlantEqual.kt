package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotSucceedsSlantEqual
 *
 * Full name:        System`NotSucceedsSlantEqual
 *
 * Usage:            NotSucceedsSlantEqual[x, y, …] displays as x ⋡ y ⋡ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotSucceedsSlantEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotSucceedsSlantEqual.html
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
fun notSucceedsSlantEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotSucceedsSlantEqual", arguments.toMutableList(), options)
}
