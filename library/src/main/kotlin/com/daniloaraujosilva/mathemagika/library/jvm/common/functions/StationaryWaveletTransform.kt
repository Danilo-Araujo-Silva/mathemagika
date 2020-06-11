package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StationaryWaveletTransform
 *
 * Full name:        System`StationaryWaveletTransform
 *
 *                   StationaryWaveletTransform[data] gives the stationary wavelet transform (SWT) of an array of data.
 *                   StationaryWaveletTransform[data, wave] gives the stationary wavelet transform using the wavelet wave.
 * Usage:            StationaryWaveletTransform[data, wave, r] gives the stationary wavelet transform using r levels of refinement.
 *
 *                   Method -> Automatic
 *                   Padding -> Periodic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StationaryWaveletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/StationaryWaveletTransform.html
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
fun stationaryWaveletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StationaryWaveletTransform", arguments.toMutableList(), options)
}
