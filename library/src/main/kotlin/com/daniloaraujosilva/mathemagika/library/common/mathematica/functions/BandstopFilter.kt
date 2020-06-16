package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BandstopFilter
 *
 * Full name:        System`BandstopFilter
 *
 *                   BandstopFilter[data, {ω , ω }] applies a bandstop filter with cutoff frequencies ω  and ω  to an array of data.
 *                                          1   2                                                      1      2
 *                   BandstopFilter[data, {{ω, q}}] uses center frequency ω and quality factor q.
 *                   BandstopFilter[data, spec, n] uses a filter kernel of length n.
 * Usage:            BandstopFilter[data, spec, n, wfun] applies a smoothing window wfun to the filter kernel.
 *
 *                   Padding -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BandstopFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/BandstopFilter.html
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
fun bandstopFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BandstopFilter", arguments.toMutableList(), options)
}
