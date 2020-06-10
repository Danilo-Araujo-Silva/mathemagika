package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LongestCommonSequencePositions
 * 
 * Full name:        System`LongestCommonSequencePositions
 * 
 *                   LongestCommonSequencePositions[s , s ] finds the longest sequence of contiguous or disjoint elements common to the strings or lists s  and s  and returns their positions.
 * Usage:                                            1   2                                                                                                1      2
 * 
 * Options:          IgnoreCase -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LongestCommonSequencePositions
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongestCommonSequencePositions.html
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
fun longestCommonSequencePositions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongestCommonSequencePositions", arguments.toMutableList(), options)
}
