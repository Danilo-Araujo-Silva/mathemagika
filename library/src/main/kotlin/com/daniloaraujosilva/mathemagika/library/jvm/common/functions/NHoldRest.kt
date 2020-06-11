package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NHoldRest
 *
 * Full name:        System`NHoldRest
 *
 * Usage:            NHoldRest is an attribute which specifies that all but the first argument to a function should not be affected by N.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NHoldRest
 * Documentation:    web: http://reference.wolfram.com/language/ref/NHoldRest.html
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
fun nHoldRest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NHoldRest", arguments.toMutableList(), options)
}
