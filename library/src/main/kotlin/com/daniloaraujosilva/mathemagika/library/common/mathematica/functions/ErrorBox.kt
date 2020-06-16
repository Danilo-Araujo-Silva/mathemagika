package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ErrorBox
 *
 * Full name:        System`ErrorBox
 *
 * Usage:            ErrorBox[boxes] is a low-level box construct that represents boxes that cannot be interpreted in input or output.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ErrorBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/ErrorBox.html
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
fun errorBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ErrorBox", arguments.toMutableList(), options)
}
