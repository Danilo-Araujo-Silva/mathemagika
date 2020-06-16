package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             McLaughlinGroupMcL
 *
 * Full name:        System`McLaughlinGroupMcL
 *
 * Usage:            McLaughlinGroupMcL[] represents the sporadic simple McLaughlin group McL.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/McLaughlinGroupMcL
 * Documentation:    web: http://reference.wolfram.com/language/ref/McLaughlinGroupMcL.html
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
fun mcLaughlinGroupMcL(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("McLaughlinGroupMcL", arguments.toMutableList(), options)
}
