package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LongestCommonSequence
 *
 * Full name:        System`LongestCommonSequence
 *
 *                   LongestCommonSequence[s , s ] finds the longest sequence of contiguous or disjoint elements common to the strings or lists s  and s .
 * Usage:                                   1   2                                                                                                1      2
 *
 * Options:          IgnoreCase -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LongestCommonSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongestCommonSequence.html
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
fun longestCommonSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongestCommonSequence", arguments.toMutableList(), options)
}
