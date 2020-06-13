package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayPad
 *
 * Full name:        System`ArrayPad
 *
 *                   ArrayPad[array, m] gives an array with m 0s of padding on every side.
 *                   ArrayPad[array, m, padding] uses the specified padding.
 *                   ArrayPad[array, {m, n}, …] pads with m elements at the beginning and n elements at the end.
 *                   ArrayPad[array, {{m , n }, {m , n }, …}, …] pads with m , n  elements at level i in array.
 * Usage:                               1   1     2   2                     i   i
 *
 *                   InterpolationOrder -> 1
 * Options:          Padding -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ArrayPad
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayPad.html
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
fun arrayPad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayPad", arguments.toMutableList(), options)
}
