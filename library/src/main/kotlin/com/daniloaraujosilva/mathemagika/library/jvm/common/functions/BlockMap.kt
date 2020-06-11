package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BlockMap
 *
 * Full name:        System`BlockMap
 *
 *                   BlockMap[f, list, n] applies f to non-overlapping sublists of length n in list.
 *                   BlockMap[f, list, n, d] applies f to sublists with offset d in list.
 *                   BlockMap[f, list, {n , n , …}, …] applies f to blocks of size n  × n  × ….
 * Usage:                                1   2                                      1    2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BlockMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlockMap.html
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
fun blockMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlockMap", arguments.toMutableList(), options)
}
