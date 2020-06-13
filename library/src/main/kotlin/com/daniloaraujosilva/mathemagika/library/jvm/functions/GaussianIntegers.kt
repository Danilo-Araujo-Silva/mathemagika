package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GaussianIntegers
 *
 * Full name:        System`GaussianIntegers
 *
 * Usage:            GaussianIntegers is an option for FactorInteger, PrimeQ, Factor, and related functions that specifies whether factorization should be done over Gaussian integers.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GaussianIntegers
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaussianIntegers.html
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
fun gaussianIntegers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaussianIntegers", arguments.toMutableList(), options)
}
