package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindowClickSelect
 *
 * Full name:        System`WindowClickSelect
 *
 * Usage:            WindowClickSelect is a notebook option that specifies whether the window for the notebook should become selected if you click it.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowClickSelect
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowClickSelect.html
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
fun windowClickSelect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowClickSelect", arguments.toMutableList(), options)
}
