package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Pattern
 *
 * Full name:        System`Pattern
 *
 * Usage:            sym : obj or Pattern[sym, obj] represents the pattern object obj, assigned the name sym.
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Pattern
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pattern.html
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
fun pattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pattern", arguments.toMutableList(), options)
}
