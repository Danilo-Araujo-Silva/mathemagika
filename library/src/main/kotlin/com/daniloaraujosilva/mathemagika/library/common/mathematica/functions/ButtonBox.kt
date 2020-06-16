package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonBox
 *
 * Full name:        System`ButtonBox
 *
 * Usage:            ButtonBox[boxes] is a low-level box construct that represents a button in a notebook expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ButtonBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonBox.html
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
fun buttonBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonBox", arguments.toMutableList(), options)
}
