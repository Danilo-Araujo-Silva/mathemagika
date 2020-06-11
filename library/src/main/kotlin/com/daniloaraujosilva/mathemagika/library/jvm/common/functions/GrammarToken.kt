package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GrammarToken
 *
 * Full name:        System`GrammarToken
 *
 * Usage:            GrammarToken[form] is a grammar rules pattern object that represents any input of the specified form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GrammarToken
 * Documentation:    web: http://reference.wolfram.com/language/ref/GrammarToken.html
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
fun grammarToken(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GrammarToken", arguments.toMutableList(), options)
}
