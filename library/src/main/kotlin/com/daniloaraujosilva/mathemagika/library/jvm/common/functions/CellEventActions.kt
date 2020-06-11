package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellEventActions
 *
 * Full name:        System`CellEventActions
 *
 * Usage:            CellEventActions is an option for Cell that gives a list of actions to perform when specified events occur in connection with a cell in a notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellEventActions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellEventActions.html
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
fun cellEventActions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellEventActions", arguments.toMutableList(), options)
}
