package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SearchQueryString
 *
 * Full name:        System`SearchQueryString
 *
 * Usage:            SearchQueryString["query"] represents a search engine-style query in TextSearch and related functions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SearchQueryString
 * Documentation:    web: http://reference.wolfram.com/language/ref/SearchQueryString.html
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
fun searchQueryString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SearchQueryString", arguments.toMutableList(), options)
}
