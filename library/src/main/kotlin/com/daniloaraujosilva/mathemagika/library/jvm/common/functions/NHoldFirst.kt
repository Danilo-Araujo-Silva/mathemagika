package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NHoldFirst
 *
 * Full name:        System`NHoldFirst
 *
 * Usage:            NHoldFirst is an attribute which specifies that the first argument to a function should not be affected by N.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NHoldFirst
 * Documentation:    web: http://reference.wolfram.com/language/ref/NHoldFirst.html
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
fun nHoldFirst(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NHoldFirst", arguments.toMutableList(), options)
}
