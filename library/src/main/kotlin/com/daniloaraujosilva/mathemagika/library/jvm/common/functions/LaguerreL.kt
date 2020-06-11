package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LaguerreL
 *
 * Full name:        System`LaguerreL
 *
 *                   LaguerreL[n, x] gives the Laguerre polynomial L (x).
 *                                                                  n
 *                                                                                 a
 *                   LaguerreL[n, a, x] gives the generalized Laguerre polynomial L (x).
 * Usage:                                                                          n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LaguerreL
 * Documentation:    web: http://reference.wolfram.com/language/ref/LaguerreL.html
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
fun laguerreL(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LaguerreL", arguments.toMutableList(), options)
}
