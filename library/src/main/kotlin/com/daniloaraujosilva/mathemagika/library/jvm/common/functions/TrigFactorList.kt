package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TrigFactorList
 *
 * Full name:        System`TrigFactorList
 *
 * Usage:            TrigFactorList[expr] factors trigonometric functions in expr, yielding a list of lists containing trigonometric monomials and exponents.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TrigFactorList
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrigFactorList.html
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
fun trigFactorList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrigFactorList", arguments.toMutableList(), options)
}
