package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLQueryDecode
 *
 * Full name:        System`URLQueryDecode
 *
 * Usage:            URLQueryDecode["string"] decodes a URL-style query string into a list of key-value rules.
 *
 *                   CharacterEncoding -> UTF-8
 *                   RemoveEmptyQueries -> False
 * Options:          SortQueries -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLQueryDecode
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLQueryDecode.html
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
fun uRLQueryDecode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLQueryDecode", arguments.toMutableList(), options)
}
