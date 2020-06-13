package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleLeftTee
 *
 * Full name:        System`DoubleLeftTee
 *
 * Usage:            DoubleLeftTee[x, y] displays as x ⫤ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleLeftTee
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleLeftTee.html
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
fun doubleLeftTee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleLeftTee", arguments.toMutableList(), options)
}
