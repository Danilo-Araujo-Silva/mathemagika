package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HilbertFilter
 *
 * Full name:        System`HilbertFilter
 *
 *                   HilbertFilter[data, ω ] applies a Hilbert filter with a cutoff frequency ω  to an array of data.
 *                                        c                                                    c
 *                   HilbertFilter[data, ω , n] uses a filter kernel of length n.
 *                                        c
 *                   HilbertFilter[data, ω , n, wfun] applies a smoothing window wfun to the filter kernel.
 * Usage:                                 c
 *
 *                   Padding -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HilbertFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/HilbertFilter.html
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
fun hilbertFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HilbertFilter", arguments.toMutableList(), options)
}
