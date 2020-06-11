package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WebSearch
 *
 * Full name:        System`WebSearch
 *
 *                   WebSearch["string"] gives a dataset of the top web search results for the specified literal string.
 *                   WebSearch[form] gives the top results obtained by doing the web search specified by form.
 * Usage:            WebSearch[form, elems] gives the elements of the web search specified by elems.
 *
 *                   AllowAdultContent -> False
 *                   Country -> Null
 *                   FileFormat -> Null
 *                   Language -> English
 *                   MaxItems -> 10
 *                   MaxItems -> 10
 *                   Method -> Bing
 *                   Site -> Null
 *                   SortedBy -> None
 * Options:          StartIndex -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WebSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/WebSearch.html
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
fun webSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WebSearch", arguments.toMutableList(), options)
}
