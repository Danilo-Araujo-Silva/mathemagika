package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KroneckerSymbol
 *
 * Full name:        System`KroneckerSymbol
 *
 *                                                                     n
 *                   KroneckerSymbol[n, m] gives the Kronecker symbol (-).
 * Usage:                                                              m
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KroneckerSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/KroneckerSymbol.html
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
fun kroneckerSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KroneckerSymbol", arguments.toMutableList(), options)
}
