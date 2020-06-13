package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PadRight
 *
 * Full name:        System`PadRight
 *
 *                   PadRight[list, n] makes a list of length n by padding list with zeros on the right.
 *                   PadRight[list, n, x] pads by repeating the element x.
 *                   PadRight[list, n, {x , x , …}] pads by cyclically repeating the elements x .
 *                                       1   2                                                 i
 *                   PadRight[list, n, padding, m] leaves a margin of m elements of padding on the left.
 *                   PadRight[list, {n , n , …}] makes a nested list with length n  at level i.
 *                                    1   2                                       i
 * Usage:            PadRight[list] pads a ragged array list with zeros to make it full.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PadRight
 * Documentation:    web: http://reference.wolfram.com/language/ref/PadRight.html
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
fun padRight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PadRight", arguments.toMutableList(), options)
}
