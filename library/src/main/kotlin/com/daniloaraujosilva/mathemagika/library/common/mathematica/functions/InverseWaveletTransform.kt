package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseWaveletTransform
 *
 * Full name:        System`InverseWaveletTransform
 *
 *                   InverseWaveletTransform[dwd] gives the inverse wavelet transform of a DiscreteWaveletData object dwd.
 *                   InverseWaveletTransform[dwd, wave] gives the inverse transform using the wavelet wave.
 * Usage:            InverseWaveletTransform[dwd, wave, wind] gives the inverse transform from the wavelet coefficients specified by wind.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InverseWaveletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseWaveletTransform.html
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
fun inverseWaveletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseWaveletTransform", arguments.toMutableList(), options)
}
