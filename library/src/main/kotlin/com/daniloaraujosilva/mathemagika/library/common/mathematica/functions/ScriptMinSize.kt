package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ScriptMinSize
 *
 * Full name:        System`ScriptMinSize
 *
 * Usage:            ScriptMinSize is an option for Style which specifies the minimum font size to use in rendering subscripts, etc.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScriptMinSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScriptMinSize.html
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
fun scriptMinSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScriptMinSize", arguments.toMutableList(), options)
}
