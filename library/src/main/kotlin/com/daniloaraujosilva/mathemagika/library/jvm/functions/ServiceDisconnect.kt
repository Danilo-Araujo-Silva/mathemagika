package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ServiceDisconnect
 *
 * Full name:        System`ServiceDisconnect
 *
 * Usage:            ServiceDisconnect[service] disconnects from an external service specified by a ServiceObject.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ServiceDisconnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/ServiceDisconnect.html
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
fun serviceDisconnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ServiceDisconnect", arguments.toMutableList(), options)
}
