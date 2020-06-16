package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LongestCommonSubsequencePositions
 *
 * Full name:        System`LongestCommonSubsequencePositions
 *
 *                   LongestCommonSubsequencePositions[s , s ] finds the longest contiguous subsequence of elements common to the strings or lists s  and s  and returns their positions {pos , pos } in s  and s .
 * Usage:                                               1   2                                                                                       1      2                                 1     2      1      2
 *
 * Options:          IgnoreCase -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LongestCommonSubsequencePositions
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongestCommonSubsequencePositions.html
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
fun longestCommonSubsequencePositions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongestCommonSubsequencePositions", arguments.toMutableList(), options)
}
