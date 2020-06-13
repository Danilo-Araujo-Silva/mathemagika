package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HTTPResponse
 *
 * Full name:        System`HTTPResponse
 *
 *                   HTTPResponse[body] is an object that represents a successful response to an HTTP request, with the specified body and default metadata.
 * Usage:            HTTPResponse[body, metadata] represents a response to an HTTP request, including the specified body and metadata.
 *
 *                   CachePersistence -> Inherited
 * Options:          CharacterEncoding -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HTTPResponse
 * Documentation:    web: http://reference.wolfram.com/language/ref/HTTPResponse.html
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
fun hTTPResponse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HTTPResponse", arguments.toMutableList(), options)
}
