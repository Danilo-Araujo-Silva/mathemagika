package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BitShiftLeft
 *
 * Full name:        System`BitShiftLeft
 *
 *                   BitShiftLeft[n, k] shifts the binary bits in the integer n to the left by k places, padding with zeros on the right.
 * Usage:            BitShiftLeft[n] shifts one bit to the left.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BitShiftLeft
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitShiftLeft.html
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
fun bitShiftLeft(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitShiftLeft", arguments.toMutableList(), options)
}
