package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteSearchIndex
 *
 * Full name:        System`DeleteSearchIndex
 *
 *                   DeleteSearchIndex[obj] deletes the search index represented by the search index object obj.
 * Usage:            DeleteSearchIndex["name"] deletes the search index with the specified name in the SearchIndices[] list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteSearchIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteSearchIndex.html
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
fun deleteSearchIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteSearchIndex", arguments.toMutableList(), options)
}
