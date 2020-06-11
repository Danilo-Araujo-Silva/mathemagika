package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnderBar
 *
 * Full name:        System`UnderBar
 *
 * Usage:            UnderBar[expr] displays with a bar under expr.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UnderBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnderBar.html
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
fun underBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnderBar", arguments.toMutableList(), options)
}
