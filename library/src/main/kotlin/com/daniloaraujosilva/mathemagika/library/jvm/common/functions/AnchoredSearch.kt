package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnchoredSearch
 *
 * Full name:        System`AnchoredSearch
 *
 * Usage:            AnchoredSearch is an option for Find and FindList that specifies whether the text searched for must be at the beginning of a record.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnchoredSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnchoredSearch.html
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
fun anchoredSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnchoredSearch", arguments.toMutableList(), options)
}
