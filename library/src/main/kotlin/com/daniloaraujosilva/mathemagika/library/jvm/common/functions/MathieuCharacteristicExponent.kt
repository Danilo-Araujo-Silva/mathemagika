package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuCharacteristicExponent
 *
 * Full name:        System`MathieuCharacteristicExponent
 *
 * Usage:            MathieuCharacteristicExponent[a, q] gives the characteristic exponent r for Mathieu functions with characteristic value a and parameter q.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MathieuCharacteristicExponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuCharacteristicExponent.html
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
fun mathieuCharacteristicExponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuCharacteristicExponent", arguments.toMutableList(), options)
}
