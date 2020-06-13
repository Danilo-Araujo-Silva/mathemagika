package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UpTee
 *
 * Full name:        System`UpTee
 *
 * Usage:            UpTee[x, y] displays as x ⊥ y.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpTee
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpTee.html
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
fun upTee(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpTee", arguments.toMutableList(), options)
}
