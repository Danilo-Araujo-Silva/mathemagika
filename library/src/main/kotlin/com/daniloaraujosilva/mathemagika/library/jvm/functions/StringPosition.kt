package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StringPosition
 *
 * Full name:        System`StringPosition
 *
 *                   StringPosition["string", "sub"] gives a list of the starting and ending character positions at which "sub" appears as a substring of "string".
 *                   StringPosition["string", patt] gives all positions at which substrings matching the general string expression patt appear in "string".
 *                   StringPosition["string", patt, n] includes only the first n occurrences of patt.
 *                   StringPosition["string", {patt , patt , …}] gives positions of all the patt .
 *                                                 1      2                                     i
 *                   StringPosition[{s , s , …}, p] gives the list of results for each of the s .
 *                                    1   2                                                    i
 * Usage:            StringPosition[patt] represents an operator form of StringPosition that can be applied to an expression.
 *
 *                   IgnoreCase -> False
 *                   MetaCharacters -> None
 * Options:          Overlaps -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringPosition.html
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
fun stringPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringPosition", arguments.toMutableList(), options)
}
