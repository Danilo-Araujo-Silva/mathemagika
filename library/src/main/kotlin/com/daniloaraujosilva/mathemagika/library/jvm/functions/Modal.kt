package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Modal
 *
 * Full name:        System`Modal
 *
 * Usage:            Modal is an option to functions such as CreateDialog that specifies whether the dialog that is created should be modal to the Wolfram System front end.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Modal
 * Documentation:    web: http://reference.wolfram.com/language/ref/Modal.html
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
fun modal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Modal", arguments.toMutableList(), options)
}
