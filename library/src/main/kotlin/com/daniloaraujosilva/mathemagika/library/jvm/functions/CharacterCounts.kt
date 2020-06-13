package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CharacterCounts
 *
 * Full name:        System`CharacterCounts
 *
 *                   CharacterCounts["string"] gives an association whose keys are the distinct characters in string, and whose values give the number of times those characters appear in string.
 * Usage:            CharacterCounts["string", n] gives counts of the distinct n-grams consisting of runs of n characters in string.
 *
 * Options:          IgnoreCase -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CharacterCounts
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacterCounts.html
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
fun characterCounts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacterCounts", arguments.toMutableList(), options)
}
