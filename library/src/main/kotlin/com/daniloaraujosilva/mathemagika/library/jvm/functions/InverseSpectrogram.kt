package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InverseSpectrogram
 *
 * Full name:        System`InverseSpectrogram
 *
 *                   InverseSpectrogram[data] reconstructs the signal from the magnitude spectrogram data.
 *                   InverseSpectrogram[img] reconstructs the signal, assuming that the image img is the magnitude spectrogram.
 *                   InverseSpectrogram[input, n] assumes the spectrogram data was computed with partitions of length n.
 *                   InverseSpectrogram[input, n, d] assumes partitions with offset d.
 * Usage:            InverseSpectrogram[input, n, d, wfun] assumes a smoothing window wfun was applied to each partition.
 *
 *                   FourierParameters -> {1, -1}
 *                   MaxIterations -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseSpectrogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseSpectrogram.html
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
fun inverseSpectrogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseSpectrogram", arguments.toMutableList(), options)
}
