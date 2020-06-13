package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LongestOrderedSequence
 *
 * Full name:        System`LongestOrderedSequence
 *
 *                   LongestOrderedSequence[list] finds the longest ordered sequence of contiguous or disjoint elements in list.
 * Usage:            LongestOrderedSequence[list, p] finds the longest ordered sequence using the ordering function p.
 *
 * Options:          IgnoreCase -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LongestOrderedSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongestOrderedSequence.html
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
fun longestOrderedSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongestOrderedSequence", arguments.toMutableList(), options)
}
