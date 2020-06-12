package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuCharacteristicB
 *
 * Full name:        System`MathieuCharacteristicB
 *
 *                   MathieuCharacteristicB[r, q] gives the characteristic value b  for odd Mathieu functions with characteristic exponent r and parameter q.
 * Usage:                                                                         r
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MathieuCharacteristicB
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuCharacteristicB.html
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
fun mathieuCharacteristicB(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuCharacteristicB", arguments.toMutableList(), options)
}
