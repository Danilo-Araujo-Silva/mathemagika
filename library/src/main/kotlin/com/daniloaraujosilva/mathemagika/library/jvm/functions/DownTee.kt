package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DownTee
 *
 * Full name:        System`DownTee
 *
 * Usage:            DownTee[x, y] displays as x ⊤ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownTee
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownTee.html
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
fun downTee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownTee", arguments.toMutableList(), options)
}
