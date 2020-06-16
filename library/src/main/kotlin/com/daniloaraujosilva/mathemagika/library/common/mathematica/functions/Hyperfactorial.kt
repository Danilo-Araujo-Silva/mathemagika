package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Hyperfactorial
 *
 * Full name:        System`Hyperfactorial
 *
 * Usage:            Hyperfactorial[n] gives the hyperfactorial function H(n).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Hyperfactorial
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hyperfactorial.html
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
fun hyperfactorial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hyperfactorial", arguments.toMutableList(), options)
}
