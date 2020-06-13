package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StringStartsQ
 *
 * Full name:        System`StringStartsQ
 *
 *                   StringStartsQ["string", patt] yields True if the beginning of string matches the string pattern patt, and yields False otherwise.
 *                   StringStartsQ[{string , string , …}, patt] gives a list of the results for each of the string .
 *                                        1        2                                                              i
 * Usage:            StringStartsQ[patt] represents an operator form of StringStartsQ that can be applied to an expression.
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringStartsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringStartsQ.html
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
fun stringStartsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringStartsQ", arguments.toMutableList(), options)
}
