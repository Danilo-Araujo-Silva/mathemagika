package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ContinuousWaveletTransform
 * 
 * Full name:        System`ContinuousWaveletTransform
 * 
 *                   ContinuousWaveletTransform[{x , x , …}] gives the continuous wavelet transform of a list of values x .
 *                                                1   2                                                                  i
 *                   ContinuousWaveletTransform[data, wave] gives the continuous wavelet transform using the wavelet wave.
 *                   ContinuousWaveletTransform[data, wave, {noct, nvoc}] gives the continuous wavelet transform using noct octaves with nvoc voices per octave.
 * Usage:            ContinuousWaveletTransform[sound, …] gives the continuous wavelet transform of sampled sound.
 * 
 *                   Padding -> None
 *                   SampleRate -> Automatic
 *                   WaveletScale -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ContinuousWaveletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuousWaveletTransform.html
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
fun continuousWaveletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuousWaveletTransform", arguments.toMutableList(), options)
}
