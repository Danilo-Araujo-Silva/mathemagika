package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Differences
 *
 * Full name:        System`Differences
 *
 *                   Differences[list] gives the successive differences of elements in list.
 *                                                    th
 *                   Differences[list, n] gives the n   differences of list.
 *                   Differences[list, n, s] gives the differences of elements step s apart.
 *                                                                          th
 *                   Differences[list, {n , n , …}] gives the successive n    differences at level k in a nested list.
 * Usage:                                1   2                            k
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Differences
 * Documentation:    web: http://reference.wolfram.com/language/ref/Differences.html
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
fun differences(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Differences", arguments.toMutableList(), options)
}
