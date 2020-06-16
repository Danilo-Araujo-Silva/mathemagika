package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BitShiftRight
 *
 * Full name:        System`BitShiftRight
 *
 *                   BitShiftRight[n, k] shifts the binary bits in the integer n to the right by k places, dropping bits that are shifted past the unit's position on the right.
 * Usage:            BitShiftRight[n] shifts one bit to the right.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BitShiftRight
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitShiftRight.html
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
fun bitShiftRight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitShiftRight", arguments.toMutableList(), options)
}
