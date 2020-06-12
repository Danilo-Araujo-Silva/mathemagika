package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeRelatedTables
 *
 * Full name:        System`IncludeRelatedTables
 *
 * Usage:            IncludeRelatedTables is an option for RelationalDatabase that specifies whether to include tables specified in foreign keys.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IncludeRelatedTables
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeRelatedTables.html
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
fun includeRelatedTables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeRelatedTables", arguments.toMutableList(), options)
}
