package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScriptSizeMultipliers
 *
 * Full name:        System`ScriptSizeMultipliers
 *
 * Usage:            ScriptSizeMultipliers is an option for Style that specifies how much smaller to render each successive level of subscripts, etc.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScriptSizeMultipliers
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScriptSizeMultipliers.html
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
fun scriptSizeMultipliers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScriptSizeMultipliers", arguments.toMutableList(), options)
}
