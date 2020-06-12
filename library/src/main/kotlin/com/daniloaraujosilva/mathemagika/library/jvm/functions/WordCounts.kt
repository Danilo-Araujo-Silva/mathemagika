package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WordCounts
 *
 * Full name:        System`WordCounts
 *
 *                   WordCounts["string"] gives an association whose keys are the distinct words identified in string, and whose values give the number of times those words appear in string.
 * Usage:            WordCounts["string", n] gives counts of the distinct n-grams consisting of runs of n words in string.
 *
 * Options:          IgnoreCase -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WordCounts
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordCounts.html
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
fun wordCounts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordCounts", arguments.toMutableList(), options)
}
