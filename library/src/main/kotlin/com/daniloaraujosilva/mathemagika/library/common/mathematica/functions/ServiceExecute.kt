package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ServiceExecute
 *
 * Full name:        System`ServiceExecute
 *
 *                   ServiceExecute[service, "req"] executes "req" on an external service.
 *                   ServiceExecute[service, "req", {par   val , …}] executes "req" with the specified settings for parameters.
 *                                                      1      1
 * Usage:            ServiceExecute[req] executes ServiceRequest req on an external service.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ServiceExecute
 * Documentation:    web: http://reference.wolfram.com/language/ref/ServiceExecute.html
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
fun serviceExecute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ServiceExecute", arguments.toMutableList(), options)
}
