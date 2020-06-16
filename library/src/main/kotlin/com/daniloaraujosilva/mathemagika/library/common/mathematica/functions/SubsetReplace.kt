package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubsetReplace
 *
 * Full name:        System`SubsetReplace
 *
 *                   SubsetReplace[list, rules] replaces sublists in list according to the specified rule or list of rules.
 *                   SubsetReplace[list, rules, n] does only the first n replacements.
 * Usage:            SubsetReplace[rules] represents an operator form of SubsetReplace that can be applied to an expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubsetReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubsetReplace.html
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
fun subsetReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubsetReplace", arguments.toMutableList(), options)
}
