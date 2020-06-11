package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HTTPRequest
 *
 * Full name:        System`HTTPRequest
 *
 *                   HTTPRequest[url] represents an HTTP request for the specified URL.
 *                   HTTPRequest[assoc] represents an HTTP request built from the components in the association assoc.
 * Usage:            HTTPRequest[url, assoc] represents an HTTP request for the specified URL with additional elements such as headers given by assoc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HTTPRequest
 * Documentation:    web: http://reference.wolfram.com/language/ref/HTTPRequest.html
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
 * Default value:    Options[HTTPRequest] := CloudObject`Private`sortOptions[With[{CloudObject`Private`opts = Options[URLRead]}, Unprotect[HTTPRequest]; Options[HTTPRequest] = CloudObject`Private`opts; Protect[HTTPRequest]; CloudObject`Private`opts]]
 *
 * Numeric values:   None
 */
fun hTTPRequest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HTTPRequest", arguments.toMutableList(), options)
}
