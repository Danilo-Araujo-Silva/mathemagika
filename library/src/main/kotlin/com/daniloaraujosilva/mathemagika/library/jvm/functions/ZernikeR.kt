package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ZernikeR
 *
 * Full name:        System`ZernikeR
 *
 *                                                                          m
 *                   ZernikeR[n, m, r] gives the radial Zernike polynomial R (r).
 * Usage:                                                                   n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ZernikeR
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZernikeR.html
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
fun zernikeR(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZernikeR", arguments.toMutableList(), options)
}
