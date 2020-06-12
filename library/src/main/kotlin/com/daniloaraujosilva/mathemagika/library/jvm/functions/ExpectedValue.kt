package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExpectedValue
 *
 * Full name:        System`ExpectedValue
 *
 *                   ExpectedValue[f, list] gives the expected value of the pure function f with respect to the values in list.
 *                   ExpectedValue[f, list, x] gives the expected value of the function f of x with respect to the values of list.
 *                   ExpectedValue[f, dist] gives the expected value of the pure function f with respect to the symbolic distribution dist.
 * Usage:            ExpectedValue[f, dist, x] gives the expected value of the function f of x with respect to the symbolic distribution dist.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExpectedValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpectedValue.html
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
fun expectedValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpectedValue", arguments.toMutableList(), options)
}
