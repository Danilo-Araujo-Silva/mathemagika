package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindRepeat
 *
 * Full name:        System`FindRepeat
 *
 *                   FindRepeat[list] finds the minimal sublist or subarray that repeats to give list.
 *                   FindRepeat[list, n] requires that the sublist be repeated at least n times in list.
 *                   FindRepeat[list, {n , n , …}] requires n  to repeat at level i in list.
 *                                      1   2                i
 *                   FindRepeat["string"] finds the minimal substring that repeats to give string.
 * Usage:            FindRepeat["string", n] requires that the substring be repeated at least n times.
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindRepeat
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindRepeat.html
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
fun findRepeat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindRepeat", arguments.toMutableList(), options)
}
