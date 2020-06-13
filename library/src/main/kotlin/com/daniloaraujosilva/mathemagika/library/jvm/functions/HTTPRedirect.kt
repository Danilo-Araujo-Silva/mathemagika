package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HTTPRedirect
 *
 * Full name:        System`HTTPRedirect
 *
 *                   HTTPRedirect[uri] represents an HTTP redirect to the specified uri.
 * Usage:            HTTPRedirect[uri, metadata] represents an HTTP redirect to uri with the specified metadata.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HTTPRedirect
 * Documentation:    web: http://reference.wolfram.com/language/ref/HTTPRedirect.html
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
fun hTTPRedirect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HTTPRedirect", arguments.toMutableList(), options)
}
