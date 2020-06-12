package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringContainsQ
 *
 * Full name:        System`StringContainsQ
 *
 *                   StringContainsQ["string", patt] yields True if any part of string matches the string pattern patt, and yields False otherwise.
 *                   StringContainsQ[{string , string , …}, patt] gives a list of the results for each of the string .
 *                                          1        2                                                              i
 * Usage:            StringContainsQ[patt] represents an operator form of StringContainsQ that can be applied to an expression.
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringContainsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringContainsQ.html
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
fun stringContainsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringContainsQ", arguments.toMutableList(), options)
}
