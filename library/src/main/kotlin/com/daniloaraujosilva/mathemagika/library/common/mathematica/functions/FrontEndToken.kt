package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FrontEndToken
 *
 * Full name:        System`FrontEndToken
 *
 *                   FrontEndToken["cmd"] is an object that represents a front end command token, typically corresponding to a front end menu item, to be executed by FrontEndExecute.
 *                   FrontEndToken[nb, "cmd"] represents a command that targets the specified notebook.
 * Usage:            FrontEndToken[nb, "cmd", param] represents a command with a parameter.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrontEndToken
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrontEndToken.html
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
fun frontEndToken(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrontEndToken", arguments.toMutableList(), options)
}
