package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseShortTimeFourier
 *
 * Full name:        System`InverseShortTimeFourier
 *
 *                   InverseShortTimeFourier[input] reconstructs the signal from short-time Fourier data.
 *                   InverseShortTimeFourier[input, n] assumes the spectrogram data was computed with partitions of length n.
 *                   InverseShortTimeFourier[input, n, d] assumes partitions with offset d.
 * Usage:            InverseShortTimeFourier[input, n, d, wfun] assumes a smoothing window wfun was applied to each partition.
 *
 *                   FourierParameters -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseShortTimeFourier
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseShortTimeFourier.html
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
fun inverseShortTimeFourier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseShortTimeFourier", arguments.toMutableList(), options)
}
