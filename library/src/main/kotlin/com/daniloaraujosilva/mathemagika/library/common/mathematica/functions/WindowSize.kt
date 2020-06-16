package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindowSize
 *
 * Full name:        System`WindowSize
 *
 * Usage:            WindowSize is a notebook option that specifies the size of window that should be used to display a notebook on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowSize.html
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
fun windowSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowSize", arguments.toMutableList(), options)
}
