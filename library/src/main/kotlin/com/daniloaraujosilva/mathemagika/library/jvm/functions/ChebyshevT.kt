package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChebyshevT
 *
 * Full name:        System`ChebyshevT
 *
 *                   ChebyshevT[n, x] gives the Chebyshev polynomial of the first kind T (x).
 * Usage:                                                                               n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ChebyshevT
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChebyshevT.html
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
fun chebyshevT(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChebyshevT", arguments.toMutableList(), options)
}
