package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JacobiSymbol
 *
 * Full name:        System`JacobiSymbol
 *
 *                                                               n
 *                   JacobiSymbol[n, m] gives the Jacobi symbol (-).
 * Usage:                                                        m
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/JacobiSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/JacobiSymbol.html
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
fun jacobiSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JacobiSymbol", arguments.toMutableList(), options)
}
