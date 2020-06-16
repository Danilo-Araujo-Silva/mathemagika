package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotTildeFullEqual
 *
 * Full name:        System`NotTildeFullEqual
 *
 * Usage:            NotTildeFullEqual[x, y, …] displays as x ≇ y ≇ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotTildeFullEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotTildeFullEqual.html
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
fun notTildeFullEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotTildeFullEqual", arguments.toMutableList(), options)
}
