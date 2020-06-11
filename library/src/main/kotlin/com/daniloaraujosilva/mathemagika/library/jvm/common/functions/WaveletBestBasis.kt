package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletBestBasis
 *
 * Full name:        System`WaveletBestBasis
 *
 *                   WaveletBestBasis[dwd] computes a best basis representation in the DiscreteWaveletData object dwd.
 * Usage:            WaveletBestBasis[dwd, cspec] computes a best basis representation using the cost specification cspec.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WaveletBestBasis
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletBestBasis.html
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
fun waveletBestBasis(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletBestBasis", arguments.toMutableList(), options)
}
