package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HumpDownHump
 *
 * Full name:        System`HumpDownHump
 *
 * Usage:            HumpDownHump[x, y, …] displays as x ≎ y ≎ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/HumpDownHump
 * Documentation:    web: http://reference.wolfram.com/language/ref/HumpDownHump.html
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
fun humpDownHump(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HumpDownHump", arguments.toMutableList(), options)
}
