package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ShortTimeFourier
 * 
 * Full name:        System`ShortTimeFourier
 * 
 *                   ShortTimeFourier[data] returns the short-time Fourier transform (STFT) of data as a ShortTimeFourierData object.
 *                   ShortTimeFourier[data, n] uses partitions of length n.
 *                   ShortTimeFourier[data, n, d] uses partitions with offset d.
 *                   ShortTimeFourier[data, n, d, wfun] applies a smoothing window wfun to each partition.
 * Usage:            ShortTimeFourier[data, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 * 
 * Options:          FourierParameters -> {1, -1}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ShortTimeFourier
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShortTimeFourier.html
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
fun shortTimeFourier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShortTimeFourier", arguments.toMutableList(), options)
}
