package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Erf
 *
 * Full name:        System`Erf
 *
 *                   Erf[z] gives the error function erf(z).
 *                   Erf[z , z ] gives the generalized error function erf(z ) - erf(z ).
 * Usage:                 0   1                                            1         0
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Erf
 * Documentation:    web: http://reference.wolfram.com/language/ref/Erf.html
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
fun erf(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Erf", arguments.toMutableList(), options)
}
