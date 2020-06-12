package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReverseSort
 *
 * Full name:        System`ReverseSort
 *
 *                   ReverseSort[list] sorts the elements of list into reverse canonical order.
 * Usage:            ReverseSort[list, p] sorts using the ordering function p.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReverseSort
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReverseSort.html
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
fun reverseSort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReverseSort", arguments.toMutableList(), options)
}
