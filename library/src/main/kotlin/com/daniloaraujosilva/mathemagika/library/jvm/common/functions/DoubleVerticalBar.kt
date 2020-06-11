package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleVerticalBar
 *
 * Full name:        System`DoubleVerticalBar
 *
 * Usage:            DoubleVerticalBar[x, y, …] displays as x ∥ y ∥ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleVerticalBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleVerticalBar.html
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
fun doubleVerticalBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleVerticalBar", arguments.toMutableList(), options)
}
