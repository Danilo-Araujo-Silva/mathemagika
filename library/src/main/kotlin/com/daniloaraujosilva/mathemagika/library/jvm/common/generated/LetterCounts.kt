package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LetterCounts
 * 
 * Full name:        System`LetterCounts
 * 
 *                   LetterCounts["string"] gives an association whose keys are the distinct letters in string, and whose values give the number of times those letters appear in string.
 *                   LetterCounts["string", n] gives counts of the distinct n-grams consisting of runs of n letters in string.
 *                   LetterCounts["string", n, {c , c , …}] allows the characters c  to appear in n-grams, in addition to ordinary letters.
 * Usage:                                        1   2                             i
 * 
 * Options:          IgnoreCase -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LetterCounts
 * Documentation:    web: http://reference.wolfram.com/language/ref/LetterCounts.html
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
fun letterCounts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LetterCounts", arguments.toMutableList(), options)
}
