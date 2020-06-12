package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HoldRest
 *
 * Full name:        System`HoldRest
 *
 * Usage:            HoldRest is an attribute which specifies that all but the first argument to a function are to be maintained in an unevaluated form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HoldRest
 * Documentation:    web: http://reference.wolfram.com/language/ref/HoldRest.html
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
fun holdRest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HoldRest", arguments.toMutableList(), options)
}
