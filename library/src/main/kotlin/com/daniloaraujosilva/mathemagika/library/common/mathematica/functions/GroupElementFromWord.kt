package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GroupElementFromWord
 *
 * Full name:        System`GroupElementFromWord
 *
 * Usage:            GroupElementFromWord[group, w] returns the element of group determined by the word w in the generators of group.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupElementFromWord
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupElementFromWord.html
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
fun groupElementFromWord(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupElementFromWord", arguments.toMutableList(), options)
}
