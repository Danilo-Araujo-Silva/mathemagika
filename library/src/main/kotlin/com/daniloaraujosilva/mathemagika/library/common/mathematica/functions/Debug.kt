package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Debug
 *
 * Full name:        System`Debug
 *
 * Usage:            System`Debug
 *
 * Options:          None
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Debug
 * Documentation:    web: http://reference.wolfram.com/language/ref/Debug.html
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
fun debug(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Debug", arguments.toMutableList(), options)
}
