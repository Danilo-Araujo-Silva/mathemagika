package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             E
 *
 * Full name:        System`E
 *
 * Usage:            E is the exponential constant  (base of natural logarithms), with numerical value ≃ 2.71828.
 *
 * Options:          None
 *
 *                   Constant
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/E
 * Documentation:    web: http://reference.wolfram.com/language/ref/E.html
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
fun e(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("E", arguments.toMutableList(), options)
}
