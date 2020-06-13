package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StringInsert
 *
 * Full name:        System`StringInsert
 *
 *                   StringInsert["string", "snew", n] yields a string with "snew" inserted starting at position n in "string".
 *                   StringInsert["string", "snew", -n] inserts at position n from the end of "string".
 *                   StringInsert["string", "snew", {n , n , …}] inserts a copy of "snew" at each of the positions n .
 *                                                    1   2                                                         i
 *                   StringInsert[{s , s , …}, "snew", n] gives the list of results for each of the s .
 * Usage:                           1   2                                                            i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringInsert
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringInsert.html
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
fun stringInsert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringInsert", arguments.toMutableList(), options)
}
