package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Fibonacci
 *
 * Full name:        System`Fibonacci
 *
 *                   Fibonacci[n] gives the Fibonacci number F .
 *                                                            n
 *                   Fibonacci[n, x] gives the Fibonacci polynomial F (x).
 * Usage:                                                            n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Fibonacci
 * Documentation:    web: http://reference.wolfram.com/language/ref/Fibonacci.html
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
fun fibonacci(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Fibonacci", arguments.toMutableList(), options)
}
