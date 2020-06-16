package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Scrollbars
 *
 * Full name:        System`Scrollbars
 *
 * Usage:            Scrollbars is an option for Pane that specifies whether scrollbars should be displayed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Scrollbars
 * Documentation:    web: http://reference.wolfram.com/language/ref/Scrollbars.html
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
fun scrollbars(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Scrollbars", arguments.toMutableList(), options)
}
