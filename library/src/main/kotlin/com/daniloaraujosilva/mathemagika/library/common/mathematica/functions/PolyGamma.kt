package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PolyGamma
 *
 * Full name:        System`PolyGamma
 *
 *                   PolyGamma[z] gives the digamma function ψ(z).
 *                                               th                                     (n)
 * Usage:            PolyGamma[n, z] gives the n   derivative of the digamma function ψ   (z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolyGamma
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyGamma.html
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
fun polyGamma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyGamma", arguments.toMutableList(), options)
}
