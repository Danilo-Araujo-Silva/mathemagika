package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringFreeQ
 *
 * Full name:        System`StringFreeQ
 *
 *                   StringFreeQ["string", patt] yields True if no substring in "string" matches the string expression patt, and yields False otherwise.
 *                   StringFreeQ["string", {patt , patt , …}] yields True if no substring matches any of the patt .
 *                                              1      2                                                         i
 *                   StringFreeQ[{s , s , …}, p] gives the list of results for each of the s .
 *                                 1   2                                                    i
 * Usage:            StringFreeQ[patt] represents an operator form of StringFreeQ that can be applied to an expression.
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringFreeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringFreeQ.html
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
fun stringFreeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringFreeQ", arguments.toMutableList(), options)
}
