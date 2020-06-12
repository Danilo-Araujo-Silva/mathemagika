package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NoneTrue
 *
 * Full name:        System`NoneTrue
 *
 *                   NoneTrue[{e , e , …}, test] yields True if test[e ] is False for all of the e .
 *                              1   2                                 i                           i
 *                   NoneTrue[expr, test, level] tests parts of expr at level level.
 * Usage:            NoneTrue[test] represents an operator form of NoneTrue that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NoneTrue
 * Documentation:    web: http://reference.wolfram.com/language/ref/NoneTrue.html
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
fun noneTrue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NoneTrue", arguments.toMutableList(), options)
}
