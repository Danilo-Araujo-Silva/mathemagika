package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AllTrue
 *
 * Full name:        System`AllTrue
 *
 *                   AllTrue[{e , e , …}, test] yields True if test[e ] is True for all of the e .
 *                             1   2                                 i                          i
 *                   AllTrue[expr, test, level] tests parts of expr at level level.
 * Usage:            AllTrue[test] represents an operator form of AllTrue that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AllTrue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllTrue.html
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
fun allTrue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllTrue", arguments.toMutableList(), options)
}
