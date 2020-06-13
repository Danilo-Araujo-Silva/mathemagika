package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpectrogramArray
 *
 * Full name:        System`SpectrogramArray
 *
 *                   SpectrogramArray[list] returns the spectrogram data of list.
 *                   SpectrogramArray[list, n] uses partitions of length n.
 *                   SpectrogramArray[list, n, d] uses partitions with offset d.
 *                   SpectrogramArray[list, n, d, wfun] applies a smoothing window wfun to each partition.
 *                   SpectrogramArray[list, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 * Usage:            SpectrogramArray[audio, …] returns spectrogram data of audio.
 *
 * Options:          FourierParameters -> {1, -1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpectrogramArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpectrogramArray.html
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
fun spectrogramArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpectrogramArray", arguments.toMutableList(), options)
}
