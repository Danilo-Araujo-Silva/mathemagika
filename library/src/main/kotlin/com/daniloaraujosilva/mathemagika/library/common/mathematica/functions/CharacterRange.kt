package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CharacterRange
 *
 * Full name:        System`CharacterRange
 *
 *                   CharacterRange[c , c ] yields a list of the characters in the range from "c " to "c ".
 *                                   1   2                                                      1       2
 *                   CharacterRange[n , n ] yields a list of the characters with character codes in the range n  to n  .
 * Usage:                            1   2                                                                     1     2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CharacterRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacterRange.html
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
fun characterRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacterRange", arguments.toMutableList(), options)
}
