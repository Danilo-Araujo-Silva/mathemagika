package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BandpassFilter
 *
 * Full name:        System`BandpassFilter
 *
 *                   BandpassFilter[data, {ω , ω }] applies a bandpass filter with cutoff frequencies ω  and ω  to an array of data.
 *                                          1   2                                                      1      2
 *                   BandpassFilter[data, {{ω, q}}] uses center frequency ω and quality factor q.
 *                   BandpassFilter[data, spec, n] uses a filter kernel of length n.
 * Usage:            BandpassFilter[data, spec, n, wfun] applies a smoothing window wfun to the filter kernel.
 *
 *                   Padding -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BandpassFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/BandpassFilter.html
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
fun bandpassFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BandpassFilter", arguments.toMutableList(), options)
}
