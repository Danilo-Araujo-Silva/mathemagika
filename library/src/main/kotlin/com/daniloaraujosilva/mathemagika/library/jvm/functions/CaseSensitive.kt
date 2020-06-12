package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CaseSensitive
 *
 * Full name:        System`CaseSensitive
 *
 * Usage:            CaseSensitive[patt] represents a string pattern that requires matching typographical case, even with the overall option setting IgnoreCase -> True.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CaseSensitive
 * Documentation:    web: http://reference.wolfram.com/language/ref/CaseSensitive.html
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
fun caseSensitive(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CaseSensitive", arguments.toMutableList(), options)
}
