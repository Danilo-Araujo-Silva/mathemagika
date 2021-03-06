package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             EmbeddedService
 *
 * Full name:        System`EmbeddedService
 *
 * Usage:            EmbeddedService[service] is an object that formats as a web frame containing content from the specified external service.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EmbeddedService
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmbeddedService.html
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
fun embeddedService(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmbeddedService", arguments.toMutableList(), options)
}
