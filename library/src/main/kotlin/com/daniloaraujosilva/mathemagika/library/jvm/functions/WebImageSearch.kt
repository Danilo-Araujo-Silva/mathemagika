package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WebImageSearch
 *
 * Full name:        System`WebImageSearch
 *
 *                   WebImageSearch["string"] gives a list of thumbnails of the top web image search results for the specified literal string.
 *                   WebImageSearch[form] gives the top results obtained by doing the web image search specified by form.
 *                   WebImageSearch[form, n] picks out the first n top results obtained by doing the web image search specified by form.
 *                   WebImageSearch[form, elems] gives the elements of the web image search specified by elems.
 * Usage:            WebImageSearch[form, elems, n] picks out the first n elements of the web image search specified by elems.
 *
 *                   AllowAdultContent -> False
 *                   Country -> Null
 *                   Description -> Null
 *                   Elements -> Null
 *                   ImageFilters -> Null
 *                   Language -> English
 *                   Location -> Null
 *                   MaxItems -> 10
 *                   MaxItems -> 10
 *                   Method -> Bing
 *                   Site -> Null
 * Options:          SortedBy -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WebImageSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/WebImageSearch.html
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
fun webImageSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WebImageSearch", arguments.toMutableList(), options)
}
