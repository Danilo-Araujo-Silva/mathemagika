package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScriptLevel
 *
 * Full name:        System`ScriptLevel
 *
 * Usage:            ScriptLevel is an option for selections that is used in determining the font size of modifiers such as subscripts and superscripts in a nested expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScriptLevel
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScriptLevel.html
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
fun scriptLevel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScriptLevel", arguments.toMutableList(), options)
}
