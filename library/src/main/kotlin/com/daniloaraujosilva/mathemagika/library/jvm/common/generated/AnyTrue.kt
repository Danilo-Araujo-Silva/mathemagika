package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AnyTrue
 * 
 * Full name:        System`AnyTrue
 * 
 *                   AnyTrue[{e , e , …}, test] yields True if test[e ] is True for any of the e .
 *                             1   2                                 i                          i
 *                   AnyTrue[expr, test, level] tests parts of expr at level level.
 * Usage:            AnyTrue[test] represents an operator form of AnyTrue that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AnyTrue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnyTrue.html
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
fun anyTrue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnyTrue", arguments.toMutableList(), options)
}
