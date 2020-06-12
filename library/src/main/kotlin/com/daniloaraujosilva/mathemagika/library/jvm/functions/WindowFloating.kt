package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WindowFloating
 *
 * Full name:        System`WindowFloating
 *
 * Usage:            WindowFloating is a notebook option that specifies whether the window for the notebook should float on top of other windows when it is displayed on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowFloating
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowFloating.html
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
fun windowFloating(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowFloating", arguments.toMutableList(), options)
}
