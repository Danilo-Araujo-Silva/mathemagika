package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WindowToolbars
 *
 * Full name:        System`WindowToolbars
 *
 * Usage:            WindowToolbars is a notebook option that specifies the toolbars to include at the top of the window used to display the notebook on the screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WindowToolbars
 * Documentation:    web: http://reference.wolfram.com/language/ref/WindowToolbars.html
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
fun windowToolbars(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowToolbars", arguments.toMutableList(), options)
}
