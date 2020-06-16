package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StringReplaceList
 *
 * Full name:        System`StringReplaceList
 *
 *                   StringReplaceList["string", s  sp] or StringReplaceList["string", {s   sp , s   sp , …}] gives a list of the strings obtained by replacing each individual occurrence of substrings in "string" matching the string expressions s .
 *                                                                                        1     1   2     2                                                                                                                                              i
 *                   StringReplaceList["string", srules, n] gives a list of the first n results obtained.
 *                   StringReplaceList[{s , s , …}, srules] gives the list of results for each of the s .
 * Usage:                                1   2                                                         i
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringReplaceList
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringReplaceList.html
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
fun stringReplaceList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringReplaceList", arguments.toMutableList(), options)
}
