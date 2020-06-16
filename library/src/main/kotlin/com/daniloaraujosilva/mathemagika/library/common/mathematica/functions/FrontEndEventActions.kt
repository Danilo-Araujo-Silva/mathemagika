package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FrontEndEventActions
 *
 * Full name:        System`FrontEndEventActions
 *
 * Usage:            FrontEndEventActions is an option for the notebook front end that gives a list of actions to perform when specified user-interface events occur.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrontEndEventActions
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrontEndEventActions.html
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
fun frontEndEventActions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrontEndEventActions", arguments.toMutableList(), options)
}
