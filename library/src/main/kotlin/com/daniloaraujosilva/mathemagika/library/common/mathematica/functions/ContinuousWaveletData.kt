package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ContinuousWaveletData
 *
 * Full name:        System`ContinuousWaveletData
 *
 *                   ContinuousWaveletData[{{oct , voc } -> coef , …}, wave] yields a continuous wavelet data object with wavelet coefficients coef  corresponding to octave and voice {oct , voc } and wavelet wave.
 * Usage:                                       1     1         1                                                                                  i                                       i     i
 *
 *                   SampleRate -> Automatic
 *                   WaveletScale -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContinuousWaveletData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuousWaveletData.html
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
fun continuousWaveletData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuousWaveletData", arguments.toMutableList(), options)
}
