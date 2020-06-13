package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PeriodogramArray
 *
 * Full name:        System`PeriodogramArray
 *
 *                   PeriodogramArray[list] returns the squared magnitude of the discrete Fourier transform (power spectrum) of list.
 *                   PeriodogramArray[list, n] averages the power spectra of non-overlapping partitions of length n.
 *                   PeriodogramArray[list, n, d] uses partitions with offset d.
 *                   PeriodogramArray[list, n, d, wfun] applies a smoothing window wfun to each partition.
 *                   PeriodogramArray[list, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 *                   PeriodogramArray[image, …] returns the squared power spectrum of image.
 * Usage:            PeriodogramArray[audio, …] returns the squared power spectrum of audio.
 *
 * Options:          FourierParameters -> {0, 1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PeriodogramArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/PeriodogramArray.html
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
fun periodogramArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PeriodogramArray", arguments.toMutableList(), options)
}
