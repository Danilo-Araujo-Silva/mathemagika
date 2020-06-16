package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotGreater
 *
 * Full name:        System`NotGreater
 *
 * Usage:            NotGreater[x, y, …] displays as x ≯ y ≯ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotGreater.html
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
fun notGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotGreater", arguments.toMutableList(), options)
}
