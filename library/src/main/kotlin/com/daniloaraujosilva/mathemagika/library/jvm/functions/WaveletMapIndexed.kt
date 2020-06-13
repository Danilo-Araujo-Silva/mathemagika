package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletMapIndexed
 *
 * Full name:        System`WaveletMapIndexed
 *
 *                   WaveletMapIndexed[f, wd] applies the function f to the arrays of coefficients and indices of a ContinuousWaveletData or DiscreteWaveletData object.
 *                   WaveletMapIndexed[f, dwd, wind] applies f to the DiscreteWaveletData coefficients specified by wind.
 * Usage:            WaveletMapIndexed[f, cwd, octvoc] applies f to the ContinuousWaveletData coefficients specified by octvoc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WaveletMapIndexed
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletMapIndexed.html
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
fun waveletMapIndexed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletMapIndexed", arguments.toMutableList(), options)
}
