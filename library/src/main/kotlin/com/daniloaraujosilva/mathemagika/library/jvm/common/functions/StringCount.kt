package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringCount
 *
 * Full name:        System`StringCount
 *
 *                   StringCount["string", "sub"] gives a count of the number of times "sub" appears as a substring of "string".
 *                   StringCount["string", patt] gives the number of substrings in "string" that match the general string expression patt.
 *                   StringCount["string", {patt , patt , …}] counts the number of occurrences of any of the patt .
 *                                              1      2                                                         i
 *                   StringCount[{s , s , …}, p] gives the list of results for each of the s .
 * Usage:                          1   2                                                    i
 *
 *                   IgnoreCase -> False
 *                   MetaCharacters -> None
 * Options:          Overlaps -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringCount.html
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
fun stringCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringCount", arguments.toMutableList(), options)
}
