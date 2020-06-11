package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GroupElementToWord
 *
 * Full name:        System`GroupElementToWord
 *
 * Usage:            GroupElementToWord[group, g] decomposes the group element g as a product of generators of group.
 *
 *                   GroupActionBase -> Automatic
 *                   MaxIterations -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GroupElementToWord
 * Documentation:    web: http://reference.wolfram.com/language/ref/GroupElementToWord.html
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
fun groupElementToWord(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GroupElementToWord", arguments.toMutableList(), options)
}
