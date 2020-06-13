package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateHTTPResponse
 *
 * Full name:        System`GenerateHTTPResponse
 *
 *                   GenerateHTTPResponse[expr] gives the HTTPResponse object that is generated when a cloud object containing expr is requested on the web.
 * Usage:            GenerateHTTPResponse[expr, req] gives the response for the HTTP request specified by req.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenerateHTTPResponse
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateHTTPResponse.html
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
fun generateHTTPResponse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateHTTPResponse", arguments.toMutableList(), options)
}
