package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FactorialPower
 *
 * Full name:        System`FactorialPower
 *
 *                                                                   (n)
 *                   FactorialPower[x, n] gives the factorial power x   .
 *                                                                             (n, h)
 * Usage:            FactorialPower[x, n, h] gives the step-h factorial power x      .
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorialPower
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorialPower.html
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
fun factorialPower(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorialPower", arguments.toMutableList(), options)
}
