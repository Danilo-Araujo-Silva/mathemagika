package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EntityFunction
 *
 * Full name:        System`EntityFunction
 *
 *                   EntityFunction[x, body] is a function with a single formal parameter x, to be used in EntityValue and related functions.
 *                   EntityFunction[{x , x , …}, body] is an EntityFunction with a list of formal parameters.
 * Usage:                             1   2
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntityFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntityFunction.html
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
 * Default value:    SyntaxInformation[EntityFunction] = {"LocalVariables" -> {"Solve", {1}}}
 *
 * Numeric values:   None
 */
fun entityFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntityFunction", arguments.toMutableList(), options)
}
