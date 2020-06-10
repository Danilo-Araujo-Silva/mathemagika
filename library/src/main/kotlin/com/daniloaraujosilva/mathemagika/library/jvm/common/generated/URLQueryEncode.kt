package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             URLQueryEncode
 * 
 * Full name:        System`URLQueryEncode
 * 
 *                   URLQueryEncode[ key   val , key   val , … ] creates a URL-style query string from an association of keys and values. 
 *                                       1      1     2      2
 *                   URLQueryEncode[{param   val , param   val , …}] creates a query string from a list of rules.
 * Usage:                                 1      1       2      1
 * 
 *                   CharacterEncoding -> UTF-8
 *                   RemoveEmptyQueries -> False
 * Options:          SortQueries -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/URLQueryEncode
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLQueryEncode.html
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
fun uRLQueryEncode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLQueryEncode", arguments.toMutableList(), options)
}
