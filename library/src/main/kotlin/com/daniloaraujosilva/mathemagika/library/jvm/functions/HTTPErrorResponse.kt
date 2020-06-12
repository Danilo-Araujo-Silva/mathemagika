package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HTTPErrorResponse
 *
 * Full name:        System`HTTPErrorResponse
 *
 * Usage:            HTTPErrorResponse[code] is an object that represents an error response to an HTTP request, with specified error code.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HTTPErrorResponse
 * Documentation:    web: http://reference.wolfram.com/language/ref/HTTPErrorResponse.html
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
fun hTTPErrorResponse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HTTPErrorResponse", arguments.toMutableList(), options)
}
