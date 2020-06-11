package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SubsetPosition
 *
 * Full name:        System`SubsetPosition
 *
 *                   SubsetPosition[list, sublist] gives a list of positions at which sublist appears in list in any order.
 *                   SubsetPosition[list, patt] gives all positions at which sublists matching patt in any order appear in list.
 * Usage:            SubsetPosition[list, patt, n] includes only the first n positions.
 *
 * Options:          Overlaps -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsetPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetPosition.html
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
fun subsetPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetPosition", arguments.toMutableList(), options)
}
