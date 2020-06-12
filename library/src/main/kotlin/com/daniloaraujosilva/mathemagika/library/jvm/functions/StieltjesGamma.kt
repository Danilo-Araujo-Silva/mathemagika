package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StieltjesGamma
 *
 * Full name:        System`StieltjesGamma
 *
 *                   StieltjesGamma[n] gives the Stieltjes constant γ .
 *                                                                   n
 *                   StieltjesGamma[n, a] gives the generalized Stieltjes constant γ (a).
 * Usage:                                                                           n
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StieltjesGamma
 * Documentation:    web: http://reference.wolfram.com/language/ref/StieltjesGamma.html
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
fun stieltjesGamma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StieltjesGamma", arguments.toMutableList(), options)
}
