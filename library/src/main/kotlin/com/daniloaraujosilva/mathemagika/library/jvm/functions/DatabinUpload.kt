package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DatabinUpload
 *
 * Full name:        System`DatabinUpload
 *
 *                   DatabinUpload[bin, {entry , entry , …}] bulk uploads all the entries entry  to a databin.
 *                                            1       2                                        i
 * Usage:            DatabinUpload[bin, EventSeries[…]] bulk uploads all entries in an event series to a databin.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatabinUpload
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatabinUpload.html
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
fun databinUpload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatabinUpload", arguments.toMutableList(), options)
}
