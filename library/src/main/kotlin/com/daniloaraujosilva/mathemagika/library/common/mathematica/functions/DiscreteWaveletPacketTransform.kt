package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteWaveletPacketTransform
 *
 * Full name:        System`DiscreteWaveletPacketTransform
 *
 *                   DiscreteWaveletPacketTransform[data] gives the discrete wavelet packet transform (DWPT) of an array of data.
 *                   DiscreteWaveletPacketTransform[data, wave] gives the discrete wavelet packet transform using the wavelet wave.
 * Usage:            DiscreteWaveletPacketTransform[data, wave, r] gives the discrete wavelet packet transform using r levels of refinement.
 *
 *                   Method -> Automatic
 *                   Padding -> Periodic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiscreteWaveletPacketTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteWaveletPacketTransform.html
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
fun discreteWaveletPacketTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteWaveletPacketTransform", arguments.toMutableList(), options)
}
