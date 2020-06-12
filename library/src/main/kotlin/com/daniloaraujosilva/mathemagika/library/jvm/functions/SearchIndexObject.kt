package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SearchIndexObject
 *
 * Full name:        System`SearchIndexObject
 *
 *                   SearchIndexObject[loc] represents a search index object, as created by CreateSearchIndex.
 * Usage:            SearchIndexObject["name"] represents the search index with the specified name in the SearchIndices[] list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SearchIndexObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/SearchIndexObject.html
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
fun searchIndexObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SearchIndexObject", arguments.toMutableList(), options)
}
