package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SubsetCases
 *
 * Full name:        System`SubsetCases
 *
 *                   SubsetCases[list, patt] gives a list of the sublists in list that match the pattern patt in any order.
 *                   SubsetCases[list, patt  rhs] gives a list of the values of rhs corresponding to matching sublists.
 * Usage:            SubsetCases[list, patt, n] includes only the first n matches.
 *
 * Options:          Overlaps -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsetCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetCases.html
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
fun subsetCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetCases", arguments.toMutableList(), options)
}
