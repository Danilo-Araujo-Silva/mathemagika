package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindowMovable
 *
 * Full name:        System`WindowMovable
 *
 * Usage:            WindowMovable is a notebook option that specifies whether to allow the window for the notebook to be moved around interactively on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowMovable
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowMovable.html
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
fun windowMovable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowMovable", arguments.toMutableList(), options)
}
