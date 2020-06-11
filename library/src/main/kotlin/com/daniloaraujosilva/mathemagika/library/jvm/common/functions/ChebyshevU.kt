package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ChebyshevU
 *
 * Full name:        System`ChebyshevU
 *
 *                   ChebyshevU[n, x] gives the Chebyshev polynomial of the second kind U (x).
 * Usage:                                                                                n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ChebyshevU
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChebyshevU.html
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
fun chebyshevU(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChebyshevU", arguments.toMutableList(), options)
}
