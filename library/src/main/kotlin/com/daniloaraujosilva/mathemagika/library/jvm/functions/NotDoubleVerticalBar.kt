package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotDoubleVerticalBar
 *
 * Full name:        System`NotDoubleVerticalBar
 *
 * Usage:            NotDoubleVerticalBar[x, y, …] displays as x ∦ y ∦ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotDoubleVerticalBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotDoubleVerticalBar.html
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
fun notDoubleVerticalBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotDoubleVerticalBar", arguments.toMutableList(), options)
}
