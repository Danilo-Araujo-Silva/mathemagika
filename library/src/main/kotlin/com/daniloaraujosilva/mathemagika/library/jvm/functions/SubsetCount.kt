package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SubsetCount
 *
 * Full name:        System`SubsetCount
 *
 *                   SubsetCount[list, sub] gives a count of the number of times sub appears in any order as sublist of list.
 * Usage:            SubsetCount[list, patt] gives the number of sublists in list that match the general pattern patt in any order.
 *
 * Options:          Overlaps -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsetCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetCount.html
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
fun subsetCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetCount", arguments.toMutableList(), options)
}
