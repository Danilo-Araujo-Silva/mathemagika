package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Alternatives
 *
 * Full name:        System`Alternatives
 *
 *                   p  | p  | … is a pattern object that represents any of the patterns p .
 * Usage:             1    2                                                              i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Alternatives
 * Documentation:    web: http://reference.wolfram.com/language/ref/Alternatives.html
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
fun alternatives(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Alternatives", arguments.toMutableList(), options)
}
