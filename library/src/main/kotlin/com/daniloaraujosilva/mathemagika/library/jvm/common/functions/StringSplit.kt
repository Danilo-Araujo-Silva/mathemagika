package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringSplit
 *
 * Full name:        System`StringSplit
 *
 *                   StringSplit["string"] splits "string" into a list of substrings separated by whitespace.
 *                   StringSplit["string", patt] splits into substrings separated by delimiters matching the string expression patt.
 *                   StringSplit["string", {p , p , …}] splits at any of the p .
 *                                           1   2                            i
 *                   StringSplit["string", patt  val] inserts val at the position of each delimiter.
 *                   StringSplit["string", {p   v , …}] inserts v  at the position of each delimiter p .
 *                                           1    1               i                                    i
 *                   StringSplit["string", patt, n] splits into at most n substrings.
 *                   StringSplit[{s , s , …}, p] gives the list of results for each of the s .
 * Usage:                          1   2                                                    i
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringSplit
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringSplit.html
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
fun stringSplit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringSplit", arguments.toMutableList(), options)
}
