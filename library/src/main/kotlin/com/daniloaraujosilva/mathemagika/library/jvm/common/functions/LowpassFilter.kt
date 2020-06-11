package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LowpassFilter
 *
 * Full name:        System`LowpassFilter
 *
 *                   LowpassFilter[data, ω ] applies a lowpass filter with a cutoff frequency ω  to an array of data.
 *                                        c                                                    c
 *                   LowpassFilter[data, ω , n] uses a filter kernel of length n.
 *                                        c
 *                   LowpassFilter[data, ω , n, wfun] applies a smoothing window wfun to the filter kernel.
 * Usage:                                 c
 *
 *                   Padding -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LowpassFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/LowpassFilter.html
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
fun lowpassFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LowpassFilter", arguments.toMutableList(), options)
}
