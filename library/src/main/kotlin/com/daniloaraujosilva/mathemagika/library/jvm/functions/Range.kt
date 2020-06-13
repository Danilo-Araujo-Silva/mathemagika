package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Range
 *
 * Full name:        System`Range
 *
 *                   Range[i   ] generates the list {1, 2, …, i   }.
 *                          max                                max
 *                   Range[i   , i   ] generates the list {i   , …, i   }.
 *                          min   max                       min      max
 *                   Range[i   , i   , di] uses step di.
 * Usage:                   min   max
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Range
 * Documentation:    web: http://reference.wolfram.com/language/ref/Range.html
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
fun range(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Range", arguments.toMutableList(), options)
}
