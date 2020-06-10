package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StringCases
 * 
 * Full name:        System`StringCases
 * 
 *                   StringCases["string", patt] gives a list of the substrings in "string" that match the string expression patt. 
 *                   StringCases["string", lhs  rhs] gives a list of the values of rhs corresponding to the substrings that match the string expression lhs. 
 *                   StringCases["string", p, n] includes only the first n substrings that match. 
 *                   StringCases["string", {p , p , …}] gives substrings that match any of the p . 
 *                                           1   2                                              i
 *                   StringCases[{s , s , …}, p] gives the list of results for each of the s . 
 *                                 1   2                                                    i
 * Usage:            StringCases[patt] represents an operator form of StringCases that can be applied to an expression.
 * 
 *                   IgnoreCase -> False
 *                   MetaCharacters -> None
 * Options:          Overlaps -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StringCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringCases.html
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
fun stringCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringCases", arguments.toMutableList(), options)
}
