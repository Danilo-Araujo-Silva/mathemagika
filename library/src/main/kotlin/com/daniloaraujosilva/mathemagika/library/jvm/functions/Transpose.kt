package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Transpose
 *
 * Full name:        System`Transpose
 *
 *                   Transpose[list] transposes the first two levels in list.
 *                                                                              th                         th
 *                   Transpose[list, {n , n , …}] transposes list so that the k   level in list is the n    level in the result.
 *                                     1   2                                                             k
 * Usage:            Transpose[list, m  n] transposes levels m and n in list, leaving all other levels unchanged.
 *
 * Options:          AllowedHeads -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Transpose
 * Documentation:    web: http://reference.wolfram.com/language/ref/Transpose.html
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
fun transpose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Transpose", arguments.toMutableList(), options)
}
