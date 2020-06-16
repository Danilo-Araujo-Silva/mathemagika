package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HTTPRequestData
 *
 * Full name:        System`HTTPRequestData
 *
 *                   HTTPRequestData["prop"] gives the value of the specified property of the current HTTP request.
 * Usage:            HTTPRequestData[] gives an association with values of properties of the current HTTP request.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HTTPRequestData
 * Documentation:    web: http://reference.wolfram.com/language/ref/HTTPRequestData.html
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
fun hTTPRequestData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HTTPRequestData", arguments.toMutableList(), options)
}
