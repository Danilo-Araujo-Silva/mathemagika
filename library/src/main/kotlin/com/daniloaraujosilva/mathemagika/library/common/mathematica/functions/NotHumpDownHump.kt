package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotHumpDownHump
 *
 * Full name:        System`NotHumpDownHump
 *
 * Usage:            NotHumpDownHump[x, y, …] displays as x  y  ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotHumpDownHump
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotHumpDownHump.html
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
fun notHumpDownHump(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotHumpDownHump", arguments.toMutableList(), options)
}
