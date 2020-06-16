package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Sort
 *
 * Full name:        System`Sort
 *
 *                   Sort[list] sorts the elements of list into canonical order.
 * Usage:            Sort[list, p] sorts using the ordering function p.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Sort
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sort.html
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
fun sort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sort", arguments.toMutableList(), options)
}
