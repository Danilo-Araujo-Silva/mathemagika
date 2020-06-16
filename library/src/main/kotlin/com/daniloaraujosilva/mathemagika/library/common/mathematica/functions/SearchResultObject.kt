package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SearchResultObject
 *
 * Full name:        System`SearchResultObject
 *
 * Usage:            SearchResultObject[…] represents a result from TextSearch[…] and related functions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SearchResultObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/SearchResultObject.html
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
fun searchResultObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SearchResultObject", arguments.toMutableList(), options)
}
