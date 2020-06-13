package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelOrder
 *
 * Full name:        System`SystemsModelOrder
 *
 * Usage:            SystemsModelOrder[sys] gives the order of the state-space model sys.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelOrder
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelOrder.html
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
fun systemsModelOrder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelOrder", arguments.toMutableList(), options)
}
