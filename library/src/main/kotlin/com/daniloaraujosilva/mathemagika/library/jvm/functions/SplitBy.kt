package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SplitBy
 *
 * Full name:        System`SplitBy
 *
 *                   SplitBy[list, f] splits list into sublists consisting of runs of successive elements that give the same value when f is applied.
 *                   SplitBy[list, {f , f , …}] recursively splits list into sublists by testing elements successively with each of the f .
 * Usage:                            1   2                                                                                               i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SplitBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/SplitBy.html
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
fun splitBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SplitBy", arguments.toMutableList(), options)
}
