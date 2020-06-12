package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScriptBaselineShifts
 *
 * Full name:        System`ScriptBaselineShifts
 *
 * Usage:            ScriptBaselineShifts is an option for Style that specifies the minimum distance in x‐heights to shift subscripts and superscripts.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScriptBaselineShifts
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScriptBaselineShifts.html
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
fun scriptBaselineShifts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScriptBaselineShifts", arguments.toMutableList(), options)
}
