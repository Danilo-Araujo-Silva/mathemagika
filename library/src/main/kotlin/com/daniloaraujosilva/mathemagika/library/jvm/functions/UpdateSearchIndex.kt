package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UpdateSearchIndex
 *
 * Full name:        System`UpdateSearchIndex
 *
 *                   UpdateSearchIndex[obj] updates the given search index object.
 * Usage:            UpdateSearchIndex["name"] updates the search index with the specified name in the SearchIndices[] list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UpdateSearchIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpdateSearchIndex.html
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
fun updateSearchIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpdateSearchIndex", arguments.toMutableList(), options)
}
