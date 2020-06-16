package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MathieuS
 *
 * Full name:        System`MathieuS
 *
 * Usage:            MathieuS[a, q, z] gives the odd Mathieu function with characteristic value a and parameter q.
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MathieuS
 * Documentation:    web: http://reference.wolfram.com/language/ref/MathieuS.html
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
fun mathieuS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MathieuS", arguments.toMutableList(), options)
}
