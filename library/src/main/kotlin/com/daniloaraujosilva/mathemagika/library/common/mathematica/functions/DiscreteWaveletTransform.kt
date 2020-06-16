package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteWaveletTransform
 *
 * Full name:        System`DiscreteWaveletTransform
 *
 *                   DiscreteWaveletTransform[data] gives the discrete wavelet transform (DWT) of an array of data.
 *                   DiscreteWaveletTransform[data, wave] gives the discrete wavelet transform using the wavelet wave.
 * Usage:            DiscreteWaveletTransform[data, wave, r] gives the discrete wavelet transform using r levels of refinement.
 *
 *                   Method -> Automatic
 *                   Padding -> Periodic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiscreteWaveletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteWaveletTransform.html
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
fun discreteWaveletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteWaveletTransform", arguments.toMutableList(), options)
}
