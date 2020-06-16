package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HighpassFilter
 *
 * Full name:        System`HighpassFilter
 *
 *                   HighpassFilter[data, ω ] applies a highpass filter with a cutoff frequency ω  to an array of data.
 *                                         c                                                     c
 *                   HighpassFilter[data, ω , n] uses a filter kernel of length n.
 *                                         c
 *                   HighpassFilter[data, ω , n, wfun] applies a smoothing window wfun to the filter kernel.
 * Usage:                                  c
 *
 *                   Padding -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HighpassFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/HighpassFilter.html
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
fun highpassFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HighpassFilter", arguments.toMutableList(), options)
}
