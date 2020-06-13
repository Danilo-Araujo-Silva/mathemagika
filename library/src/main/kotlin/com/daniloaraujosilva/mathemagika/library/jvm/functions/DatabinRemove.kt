package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DatabinRemove
 *
 * Full name:        System`DatabinRemove
 *
 *                                                       th
 *                   DatabinRemove[bin, i] removes the i  entry from a databin.
 *                   DatabinRemove[bin, uuid] removes the entry with the specified UUID from a databin.
 * Usage:            DatabinRemove[bin, {i, j}] removes the span of entries with indices from i through j.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatabinRemove
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatabinRemove.html
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
fun databinRemove(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatabinRemove", arguments.toMutableList(), options)
}
