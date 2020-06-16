package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ServiceConnect
 *
 * Full name:        System`ServiceConnect
 *
 *                   ServiceConnect["service"] creates a connection to an external service.
 * Usage:            ServiceConnect["service", id] uses the specified connection identifier.
 *
 *                   ConnectionSettings -> Automatic
 *                   DeletePreviousConnections -> False
 * Options:          SaveConnection -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ServiceConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/ServiceConnect.html
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
fun serviceConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ServiceConnect", arguments.toMutableList(), options)
}
