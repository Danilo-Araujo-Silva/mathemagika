package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ToRadicals
 *
 * Full name:        System`ToRadicals
 *
 * Usage:            ToRadicals[expr] attempts to express all Root objects in expr in terms of radicals.
 *
 *                   Assumptions -> Automatic
 *                   Cubics -> True
 * Options:          Quartics -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToRadicals
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToRadicals.html
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
fun toRadicals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToRadicals", arguments.toMutableList(), options)
}
