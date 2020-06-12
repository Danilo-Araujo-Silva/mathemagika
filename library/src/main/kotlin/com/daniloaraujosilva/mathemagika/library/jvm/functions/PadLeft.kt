package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PadLeft
 *
 * Full name:        System`PadLeft
 *
 *                   PadLeft[list, n] makes a list of length n by padding list with zeros on the left.
 *                   PadLeft[list, n, x] pads by repeating the element x.
 *                   PadLeft[list, n, {x , x , …}] pads by cyclically repeating the elements x .
 *                                      1   2                                                 i
 *                   PadLeft[list, n, padding, m] leaves a margin of m elements of padding on the right.
 *                   PadLeft[list, {n , n , …}] makes a nested list with length n  at level i.
 *                                   1   2                                       i
 * Usage:            PadLeft[list] pads a ragged array list with zeros to make it full.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PadLeft
 * Documentation:    web: http://reference.wolfram.com/language/ref/PadLeft.html
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
fun padLeft(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PadLeft", arguments.toMutableList(), options)
}
