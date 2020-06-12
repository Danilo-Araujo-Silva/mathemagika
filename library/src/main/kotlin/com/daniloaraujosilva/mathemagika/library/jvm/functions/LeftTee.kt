package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LeftTee
 *
 * Full name:        System`LeftTee
 *
 * Usage:            LeftTee[x, y] displays as x ⊣ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftTee
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftTee.html
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
fun leftTee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftTee", arguments.toMutableList(), options)
}
