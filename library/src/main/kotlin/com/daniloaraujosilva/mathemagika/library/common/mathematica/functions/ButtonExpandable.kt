package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonExpandable
 *
 * Full name:        System`ButtonExpandable
 *
 * Usage:            ButtonExpandable is an option for the low-level function ButtonBox that specifies whether the button should expand to fill any GridBox position in which it appears.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonExpandable
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonExpandable.html
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
fun buttonExpandable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonExpandable", arguments.toMutableList(), options)
}
