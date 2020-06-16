package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CaseOrdering
 *
 * Full name:        System`CaseOrdering
 *
 * Usage:            CaseOrdering is an option for AlphabeticSort and related functions that specifies how upper versus lower case should be sorted.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CaseOrdering
 * Documentation:    web: http://reference.wolfram.com/language/ref/CaseOrdering.html
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
fun caseOrdering(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CaseOrdering", arguments.toMutableList(), options)
}
