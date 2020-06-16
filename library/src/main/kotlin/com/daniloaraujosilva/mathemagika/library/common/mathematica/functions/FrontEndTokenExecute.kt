package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FrontEndTokenExecute
 *
 * Full name:        System`FrontEndTokenExecute
 *
 * Usage:            FrontEndTokenExecute["cmd"] executes the specified front end command token, typically corresponding to a front end menu item.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FrontEndTokenExecute
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrontEndTokenExecute.html
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
fun frontEndTokenExecute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrontEndTokenExecute", arguments.toMutableList(), options)
}
