package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SearchIndices
 *
 * Full name:        System`SearchIndices
 *
 * Usage:            SearchIndices[] returns a list with all the locally stored instances of SearchIndexObject.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SearchIndices
 * Documentation:    web: http://reference.wolfram.com/language/ref/SearchIndices.html
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
fun searchIndices(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SearchIndices", arguments.toMutableList(), options)
}
