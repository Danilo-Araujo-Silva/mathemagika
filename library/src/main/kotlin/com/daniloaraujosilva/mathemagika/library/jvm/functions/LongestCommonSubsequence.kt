package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LongestCommonSubsequence
 *
 * Full name:        System`LongestCommonSubsequence
 *
 *                   LongestCommonSubsequence[s , s ] finds the longest contiguous subsequence of elements common to the strings or lists s  and s .
 * Usage:                                      1   2                                                                                       1      2
 *
 * Options:          IgnoreCase -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LongestCommonSubsequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongestCommonSubsequence.html
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
fun longestCommonSubsequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongestCommonSubsequence", arguments.toMutableList(), options)
}
