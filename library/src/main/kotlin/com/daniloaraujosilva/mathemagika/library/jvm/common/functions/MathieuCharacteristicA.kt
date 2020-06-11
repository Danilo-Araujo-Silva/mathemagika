package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuCharacteristicA
 *
 * Full name:        System`MathieuCharacteristicA
 *
 *                   MathieuCharacteristicA[r, q] gives the characteristic value a  for even Mathieu functions with characteristic exponent r and parameter q.
 * Usage:                                                                         r
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MathieuCharacteristicA
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuCharacteristicA.html
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
fun mathieuCharacteristicA(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuCharacteristicA", arguments.toMutableList(), options)
}
