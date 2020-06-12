package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StationaryWaveletPacketTransform
 *
 * Full name:        System`StationaryWaveletPacketTransform
 *
 *                   StationaryWaveletPacketTransform[data] gives the stationary wavelet packet transform (SWPT) of an array of data.
 *                   StationaryWaveletPacketTransform[data, wave] gives the stationary wavelet packet transform using the wavelet wave.
 * Usage:            StationaryWaveletPacketTransform[data, wave, r] gives the stationary wavelet packet transform using r levels of refinement.
 *
 *                   Method -> Automatic
 *                   Padding -> Periodic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StationaryWaveletPacketTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/StationaryWaveletPacketTransform.html
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
fun stationaryWaveletPacketTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StationaryWaveletPacketTransform", arguments.toMutableList(), options)
}
